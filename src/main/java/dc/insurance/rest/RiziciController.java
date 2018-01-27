package dc.insurance.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dc.insurance.DTO.CenaDTO;
import dc.insurance.DTO.CenaRequestDTO;
import dc.insurance.DTO.NekretninaDTO;
import dc.insurance.DTO.OsobaDTO;
import dc.insurance.DTO.PolisaDTO;
import dc.insurance.DTO.RizikDTO;
import dc.insurance.DTO.VoziloDTO;
import dc.insurance.domain.Nekretnina;
import dc.insurance.domain.Osoba;
import dc.insurance.domain.Polisa;
import dc.insurance.domain.Rizik;
import dc.insurance.domain.Stavka;
import dc.insurance.domain.TipRizika;
import dc.insurance.domain.Vozilo;
import dc.insurance.repo.NekretninaRepository;
import dc.insurance.repo.OsobaRepository;
import dc.insurance.repo.PolisaRepository;
import dc.insurance.repo.RizikRepository;
import dc.insurance.repo.StavkaRepository;
import dc.insurance.repo.TipRizikaRepository;
import dc.insurance.repo.VoziloRepository;

import javax.ws.rs.core.MediaType;

@RestController
@CrossOrigin
@RequestMapping("/dcRizici")
public class RiziciController {

	@Autowired
    private TipRizikaRepository tipRizikaRepository;

    @Autowired
    private RizikRepository rizikRepository;

    @Autowired
    private PolisaRepository polisaRepository;

    @Autowired
    private OsobaRepository osobaRepository;

    @Autowired
    private NekretninaRepository nekretninaRepository;

    @Autowired
    private VoziloRepository voziloRepository;
    
    @Autowired
    private StavkaRepository stavkaRepository;
    
    @PostMapping(value = "/cena", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> postCena(@RequestBody CenaRequestDTO cenaReq) //, @RequestBody RizikDTO rizikDTO, @RequestBody Integer trajanje
    {
    	RizikDTO rizikDTO = cenaReq.rizikDTO;
    	ArrayList<RizikDTO> riziciDTO = cenaReq.riziciDTO;
    	int trajanje = cenaReq.trajanje;
    	
    	System.out.println("ne verujem");
    	
    	ArrayList<Integer> ids = new ArrayList<>();
    	
    	riziciDTO.forEach(item -> ids.add(item.idRizik));
    	
    	List<Rizik> rizici =  rizikRepository.findByIdRizikIn(ids);
    	Rizik rizik = rizikRepository.findOne(rizikDTO.idRizik);
    	
    	List<Stavka> stavke = stavkaRepository.findByRizik(rizik);
    	Stavka stavkaSaCenom = stavke.get(0);
    	
    	List<Stavka> stavkeSaKolicnikom = stavkaRepository.findByRizikIn(rizici);
    	
    	List<Integer> tipoviRizikaID = new ArrayList<>();
    	rizici.forEach(item -> tipoviRizikaID.add(item.getTipRizika().getIdTipRizika()));
    	
    	List<TipRizika> tipoviRizika = tipRizikaRepository.findByIdTipRizikaIn(tipoviRizikaID);
    	
    	//Region Evropa 10 xxx
    	// 0.1 
    	//1 +  . . .. .   3.2
    	
    	ArrayList<CenaDTO> cene = new ArrayList<CenaDTO>();
    	double ukupanKolicnik = 0;
    	
    	for(Stavka s : stavkeSaKolicnikom)
    	{
    		ukupanKolicnik += s.getKolicnik();
    		
    		CenaDTO cena = new CenaDTO();
    		
    		cena.cena = s.getKolicnik() * stavkaSaCenom.getJedinicnaCena();
    		System.out.println("KOL: " + s.getKolicnik() + " " + stavkaSaCenom.getJedinicnaCena());
    		cena.tipRizika = getNazivTipaRizika(s.getRizik().getTipRizika().getIdTipRizika(), tipoviRizika);
    		cena.rizik = s.getRizik().getVrednost();
    		
    		cene.add(cena);
    	}
    	
    	return new ResponseEntity<>(cene, HttpStatus.OK);
    }
    
    public String getNazivTipaRizika(int id, List<TipRizika> list)
    {
    	for(TipRizika tr : list)
    	{
    		if(tr.getIdTipRizika() == id)
    			return tr.getNaziv();
    	}
    	return "";
    }
    
    @PostMapping(value = "/polisa")
    public ResponseEntity<?> postPolisa(@RequestBody PolisaDTO polisa) {

        Polisa p = new Polisa();

        List<Osoba> osiguranici = new ArrayList<Osoba>();
        for(OsobaDTO osiguranik: polisa.osiguranici){
            Osoba osoba = new Osoba(Osoba.TIPOSOBE.OSIGURANIK, osiguranik.ime, osiguranik.prezime, osiguranik.jmbg, osiguranik.adresa, osiguranik.brojPasosa, osiguranik.brojTelefona, osiguranik.datumRodjenja, osiguranik.email);
            osiguranici.add(osoba);
        }

        osiguranici = this.osobaRepository.save(osiguranici);

        Osoba nosilac = null;
        if(polisa.nosilac.tipOsobe == OsobaDTO.TipOsobe.OSIGURANIK){
            nosilac = new Osoba(Osoba.TIPOSOBE.OSIGURANIK, polisa.nosilac.ime, polisa.nosilac.prezime, polisa.nosilac.jmbg, polisa.nosilac.adresa, polisa.nosilac.brojPasosa, polisa.nosilac.brojTelefona, polisa.nosilac.datumRodjenja, polisa.nosilac.email);
        }else{
            nosilac = new Osoba(Osoba.TIPOSOBE.DRUGO_LICE, polisa.nosilac.ime, polisa.nosilac.prezime, polisa.nosilac.jmbg, polisa.nosilac.adresa, polisa.nosilac.brojPasosa, polisa.nosilac.brojTelefona, polisa.nosilac.datumRodjenja, polisa.nosilac.email);
        }

        nosilac = this.osobaRepository.save(nosilac);

        List<Integer> ids = new ArrayList<Integer>();
        for(RizikDTO riziciPutnoDTO: polisa.riziciPutno){
            ids.add(riziciPutnoDTO.idRizik);
        }

        p.setRizici(this.rizikRepository.findByIdRizikIn(ids));


        int trajanje = polisa.trajanjeOsiguranja;
        Date datum = polisa.pocetakOsiguranja;

        List<Nekretnina> nekretnine = new ArrayList<Nekretnina>();
        for(NekretninaDTO n: polisa.nekretnine){
            Osoba vlasnik = new Osoba(null, n.vlasnik.ime, n.vlasnik.prezime, n.vlasnik.jmbg, n.vlasnik.adresa, n.vlasnik.brojPasosa, n.vlasnik.brojTelefona, n.vlasnik.datumRodjenja, n.vlasnik.email);
            vlasnik = this.osobaRepository.save(vlasnik);
            List<Integer> ids1 = new ArrayList<Integer>();
            for(RizikDTO rdto: n.rizici){
                ids1.add(rdto.idRizik);
            }
            Nekretnina nek = new Nekretnina();
            nek.setRizici(this.rizikRepository.findByIdRizikIn(ids1));
            nek.setVlasnik(vlasnik);
            nekretnine.add(nek);
        }

        nekretnine = this.nekretninaRepository.save(nekretnine);

        List<Vozilo> vozila = new ArrayList<Vozilo>();
        for(VoziloDTO n: polisa.vozila){
            Osoba vlasnik = new Osoba(null, n.vlasnik.ime, n.vlasnik.prezime, n.vlasnik.jmbg, n.vlasnik.adresa, n.vlasnik.brojPasosa, n.vlasnik.brojTelefona, n.vlasnik.datumRodjenja, n.vlasnik.email);
            vlasnik = this.osobaRepository.save(vlasnik);
            List<Integer> ids2 = new ArrayList<Integer>();
            for(RizikDTO rdto: n.rizici){
                ids2.add(rdto.idRizik);
            }
            Vozilo voz = new Vozilo();
            voz.setRizici(this.rizikRepository.findByIdRizikIn(ids2));
            voz.setVlasnik(vlasnik);
            voz.setBrojSasije(n.brojSasije);
            voz.setGodinaProizvodnje(n.godinaProizvodnje);
            voz.setTablice(n.brojTablica);
            voz.setMarkaTip(n.markaTip);
            vozila.add(voz);
        }

        p.setDatum(datum);
        p.setTrajanje(trajanje);
        p.setEmail(nosilac.getEmail());
        p.setNekretnine(nekretnine);
        p.setNosilac(nosilac);
        p.setOsiguranici(osiguranici);
        p.setVozila(this.voziloRepository.save(vozila));
        this.polisaRepository.save(p);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviStarosneGrupe")
    public ResponseEntity<?> dobaviStarosneGrupe() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Starost osoba");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getOsiguranjaDoIznosa")
    public ResponseEntity<?> dobaviOsiguranjaDoIznosa() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Osiguran do iznosa");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviRegione")
    public ResponseEntity<?> dobaviDestinacije() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Region");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviSvrheOsiguranja")
    public ResponseEntity<?> dobaviSvrheOsiguranja() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Sport");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviPaketeOsiguranja")
    public ResponseEntity<?> dobaviPaketeOsiguranja() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Paket");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviStarostiStana")
    public ResponseEntity<?> dobaviStarostiStana() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Starost stana");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.GET, value = "/dobaviProcenjeneVrednostiStana")
    public ResponseEntity<?> dobaviProcenjeneVrednostiStana() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Procenjena vrednost");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviOsiguranjaStana")
    public ResponseEntity<?> dobaviOsiguranjaStana() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Od cega se osigurava");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getSlepovanje")
    public ResponseEntity<?> dobaviSleopovanje() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Slepovanje");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getPopravka")
    public ResponseEntity<?> dobaviPopravka() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Popravka");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getSmestaj")
    public ResponseEntity<?> dobaviSmestaj() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Smestaj");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getPrevoz")
    public ResponseEntity<?> dobaviPrevoz() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Prevoz");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getPovrsina")
    public ResponseEntity<?> dobaviPovrsinu() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Povrsina");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }
}
