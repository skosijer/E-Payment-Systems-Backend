package dc.insurance.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dc.insurance.domain.Cenovnik;
import dc.insurance.domain.Faktura;
import dc.insurance.domain.Kategorija;
import dc.insurance.domain.Marka;
import dc.insurance.domain.Model;
import dc.insurance.domain.Nekretnina;
import dc.insurance.domain.Osiguranik;
import dc.insurance.domain.Osiguravac;
import dc.insurance.domain.Osoba;
import dc.insurance.domain.Polisa;
import dc.insurance.domain.Rizik;
import dc.insurance.domain.Stavka;
import dc.insurance.domain.StavkaCenovnik;
import dc.insurance.domain.TipRizika;
import dc.insurance.domain.Vozilo;
import dc.insurance.repo.CenovnikRepository;
import dc.insurance.repo.FakturaRepository;
import dc.insurance.repo.KategorijaRepository;
import dc.insurance.repo.MarkaRepository;
import dc.insurance.repo.ModelRepository;
import dc.insurance.repo.NekretninaRepository;
import dc.insurance.repo.OsiguranikRepository;
import dc.insurance.repo.OsiguravacRepository;
import dc.insurance.repo.OsobaRepository;
import dc.insurance.repo.PolisaRepository;
import dc.insurance.repo.RizikRepository;
import dc.insurance.repo.StavkaCenovnikRepository;
import dc.insurance.repo.StavkaRepository;
import dc.insurance.repo.TipRizikaRepository;
import dc.insurance.repo.VoziloRepository;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	private KategorijaRepository kategorijaRepository; 
	
	@Autowired
	private TipRizikaRepository tipRizikaRepository; 
	
	@Autowired
	private RizikRepository rizikRepository; 
	
	@Autowired
	private CenovnikRepository cenovnikRepository; 
	
	@Autowired
	private StavkaCenovnikRepository stavkaCenovnikRepository; 
	
	@Autowired
	private OsobaRepository osobaRepository; 
	
	@Autowired
	private OsiguravacRepository osiguravacRepository; 
	
	@Autowired 
	private OsiguranikRepository osiguranikRepository; 
	
	@Autowired
	private PolisaRepository polisaRepository; 
	
	@Autowired 
	private FakturaRepository fakturaRepository; 
	
	@Autowired 
	private StavkaRepository stavkaRepository; 
	
	@Autowired
	private NekretninaRepository nekretninaRepository; 
	
	@Autowired
	private MarkaRepository markaRepository; 
	
	@Autowired
	private ModelRepository modelRepository; 
	
	@Autowired
	private VoziloRepository voziloRepository; 
	
	//@Value("${jelena.google.key}")
	//private String jelenaApiKey;

	
	@RequestMapping(method = RequestMethod.GET, value = "/fill-insurance-database")
	public ResponseEntity<?> fillInsuranceDatabase() {
		
		Kategorija kat1 = new Kategorija(); 
	
		kat1.setNaziv("Putno osiguranje");
		kategorijaRepository.save(kat1); 
		
		Kategorija kat2 = new Kategorija(); 
		kat2.setNaziv("Osiguranje nekretnine");
		kategorijaRepository.save(kat2); 
		
		Kategorija kat3 = new Kategorija(); 
		kat3.setNaziv("Pomoć na putu");
		kategorijaRepository.save(kat3); 
		
		//Tipovi rizika za putno osiguranje
		TipRizika tipRizika1 = new TipRizika(); 
		tipRizika1.setKategorija(kat1);
		tipRizika1.setNaziv("Region");
		tipRizikaRepository.save(tipRizika1); 
		
		TipRizika tipRizika2 = new TipRizika(); 
		tipRizika2.setKategorija(kat1);
		tipRizika2.setNaziv("Sport");
		tipRizikaRepository.save(tipRizika2); 
		
		//Tipovi rizika za osiguranje nekretnine
		TipRizika tipRizika3 = new TipRizika(); 
		tipRizika3.setKategorija(kat2);
		tipRizika3.setNaziv("Osiguranja stana");
		tipRizikaRepository.save(tipRizika3); 
		
		//Tipovi rizika za osiguranje pomoc na putu
		TipRizika tipRizika4 = new TipRizika(); 
		tipRizika4.setKategorija(kat3);
		tipRizika4.setNaziv("Paket");
		tipRizikaRepository.save(tipRizika4);

		TipRizika tipRizika5 = new TipRizika();
		tipRizika5.setKategorija(kat1);
		tipRizika5.setNaziv("Starost");
		tipRizikaRepository.save(tipRizika5);
		
		TipRizika tipRizika6 = new TipRizika();
		tipRizika6.setKategorija(kat2);
		tipRizika6.setNaziv("Starost stana");
		tipRizikaRepository.save(tipRizika6);
		
		TipRizika tipRizika7 = new TipRizika();
		tipRizika7.setKategorija(kat2);
		tipRizika7.setNaziv("Procenjena vrednost stana");
		tipRizikaRepository.save(tipRizika7);
		
		////////////////////////////////////////
		// CENOVNIK
		////////////////////////////////////////
		// Cenovnik od 01.01.2017 do 01.02.2017
		Cenovnik cenovnik1 = new Cenovnik(); 
		cenovnik1.setOd(new Date(1483225200000L));
		cenovnik1.setDoo(new Date(1485903600000L));
		cenovnikRepository.save(cenovnik1); 
		
		Cenovnik cenovnik2 = new Cenovnik(); 
		cenovnik2.setOd(new Date(1485903600000L));
		cenovnik2.setDoo(new Date(1493589600000L));
		cenovnikRepository.save(cenovnik2); 
		
		Cenovnik cenovnik3 = new Cenovnik(); 
		cenovnik3.setOd(new Date(1493589600000L));
		cenovnik3.setDoo(new Date(1514761200000L));
		cenovnikRepository.save(cenovnik3); 
		
		//Stavke cenovnika1
		StavkaCenovnik stavkaCenovnik1 = new StavkaCenovnik(); 
		stavkaCenovnik1.setCenovnik(cenovnik1);
		stavkaCenovnik1.setIznos(1000);
		stavkaCenovnikRepository.save(stavkaCenovnik1); 
		
		StavkaCenovnik stavkaCenovnik2 = new StavkaCenovnik(); 
		stavkaCenovnik2.setCenovnik(cenovnik1);
		stavkaCenovnik2.setIznos(1500);
		stavkaCenovnikRepository.save(stavkaCenovnik2); 
		
		StavkaCenovnik stavkaCenovnik3 = new StavkaCenovnik(); 
		stavkaCenovnik3.setCenovnik(cenovnik1);
		stavkaCenovnik3.setIznos(2000);
		stavkaCenovnikRepository.save(stavkaCenovnik3); 
		
		//Stavke cenovnika2
		StavkaCenovnik stavkaCenovnik4 = new StavkaCenovnik(); 
		stavkaCenovnik4.setCenovnik(cenovnik2);
		stavkaCenovnik4.setIznos(2500);
		stavkaCenovnikRepository.save(stavkaCenovnik4); 
		
		StavkaCenovnik stavkaCenovnik5 = new StavkaCenovnik(); 
		stavkaCenovnik5.setCenovnik(cenovnik2);
		stavkaCenovnik5.setIznos(3000);
		stavkaCenovnikRepository.save(stavkaCenovnik5); 
		
		StavkaCenovnik stavkaCenovnik6 = new StavkaCenovnik(); 
		stavkaCenovnik6.setCenovnik(cenovnik2);
		stavkaCenovnik6.setIznos(3500);
		stavkaCenovnikRepository.save(stavkaCenovnik6); 
		
		//Stavke cenovnika3
		StavkaCenovnik stavkaCenovnik7 = new StavkaCenovnik(); 
		stavkaCenovnik7.setCenovnik(cenovnik3);
		stavkaCenovnik7.setIznos(4000);
		stavkaCenovnikRepository.save(stavkaCenovnik7); 
		
		StavkaCenovnik stavkaCenovnik8 = new StavkaCenovnik(); 
		stavkaCenovnik8.setCenovnik(cenovnik3);
		stavkaCenovnik8.setIznos(4500);
		stavkaCenovnikRepository.save(stavkaCenovnik8); 
		
		//Region
		Rizik rizik1 = new Rizik(); 
		rizik1.setStavkaCenovnik(stavkaCenovnik8);
		rizik1.setTipRizika(tipRizika1);
		rizik1.setVrednost("Evropa - nadoknada stete do 30.000€.");
		rizikRepository.save(rizik1); 
		
		Rizik rizik2 = new Rizik(); 
		rizik2.setStavkaCenovnik(stavkaCenovnik7);
		rizik2.setTipRizika(tipRizika1);
		rizik2.setVrednost("Svet - nadoknada stete do 40.000€.");
		rizikRepository.save(rizik2); 
		
		Rizik rizik3 = new Rizik(); 
		rizik3.setStavkaCenovnik(stavkaCenovnik6);
		rizik3.setTipRizika(tipRizika1);
		rizik3.setVrednost("Interkontinentalno - nadoknada stete do 15.000€.");
		rizikRepository.save(rizik3); 
		
		//Sport
		Rizik rizik4 = new Rizik(); 
		rizik4.setStavkaCenovnik(stavkaCenovnik5);
		rizik4.setTipRizika(tipRizika2);
		rizik4.setVrednost("Skijanje");
		rizikRepository.save(rizik4); 
		
		Rizik rizik5 = new Rizik(); 
		rizik5.setStavkaCenovnik(stavkaCenovnik4);
		rizik5.setTipRizika(tipRizika2);
		rizik5.setVrednost("Turistički");
		rizikRepository.save(rizik5); 
		
		//Generalno
		Rizik rizik6 = new Rizik(); 
		rizik6.setStavkaCenovnik(stavkaCenovnik3);
		rizik6.setTipRizika(tipRizika3);
		rizik6.setVrednost("Poplava");
		rizikRepository.save(rizik6); 
		
		Rizik rizik7 = new Rizik(); 
		rizik7.setStavkaCenovnik(stavkaCenovnik2);
		rizik7.setTipRizika(tipRizika3);
		rizik7.setVrednost("Krađa");
		rizikRepository.save(rizik7); 
		
		Rizik rizik8 = new Rizik(); 
		rizik8.setStavkaCenovnik(stavkaCenovnik1);
		rizik8.setTipRizika(tipRizika3);
		rizik8.setVrednost("Požar");
		rizikRepository.save(rizik8);

		Rizik rizik9 = new Rizik();
		rizik9.setStavkaCenovnik(stavkaCenovnik1);
		rizik9.setTipRizika(tipRizika5);
		rizik9.setVrednost("Deca (0 - 18 godina)");
		rizikRepository.save(rizik9);

		Rizik rizik10 = new Rizik();
		rizik10.setStavkaCenovnik(stavkaCenovnik1);
		rizik10.setTipRizika(tipRizika5);
		rizik10.setVrednost("Odrasli (19 - 70 godina)");
		rizikRepository.save(rizik10);

		Rizik rizik11 = new Rizik();
		rizik11.setStavkaCenovnik(stavkaCenovnik1);
		rizik11.setTipRizika(tipRizika5);
		rizik11.setVrednost("Starija lica (preko 70 godina)");
		rizikRepository.save(rizik11);
		
		Rizik rizik12 = new Rizik();
		rizik12.setStavkaCenovnik(stavkaCenovnik1);
		rizik12.setTipRizika(tipRizika4);
		rizik12.setVrednost("Šlepovanje do određene kilometraže");
		rizikRepository.save(rizik12);

		Rizik rizik13 = new Rizik();
		rizik13.setStavkaCenovnik(stavkaCenovnik1);
		rizik13.setTipRizika(tipRizika4);
		rizik13.setVrednost("Popravka do određene cene");
		rizikRepository.save(rizik13);
		
		Rizik rizik14 = new Rizik();
		rizik14.setStavkaCenovnik(stavkaCenovnik1);
		rizik14.setTipRizika(tipRizika4);
		rizik14.setVrednost("Smeštaj u hotelu do određenog broja dana");
		rizikRepository.save(rizik14);
		
		Rizik rizik15 = new Rizik();
		rizik15.setStavkaCenovnik(stavkaCenovnik1);
		rizik15.setTipRizika(tipRizika4);
		rizik15.setVrednost("Alternativni prevoz");
		rizikRepository.save(rizik15);
		
		Rizik rizik16 = new Rizik();
		rizik16.setStavkaCenovnik(stavkaCenovnik1);
		rizik16.setTipRizika(tipRizika6);
		rizik16.setVrednost("Do 5 godina");
		rizikRepository.save(rizik16);
		
		Rizik rizik17 = new Rizik();
		rizik17.setStavkaCenovnik(stavkaCenovnik1);
		rizik17.setTipRizika(tipRizika6);
		rizik17.setVrednost("Do 20 godina");
		rizikRepository.save(rizik17);
		
		Rizik rizik18 = new Rizik();
		rizik18.setStavkaCenovnik(stavkaCenovnik1);
		rizik18.setTipRizika(tipRizika6);
		rizik18.setVrednost("Do 50 godina");
		rizikRepository.save(rizik18);
		
		Rizik rizik19 = new Rizik();
		rizik19.setStavkaCenovnik(stavkaCenovnik1);
		rizik19.setTipRizika(tipRizika6);
		rizik19.setVrednost("Preko 50 godina");
		rizikRepository.save(rizik19);
		
		Rizik rizik20 = new Rizik();
		rizik20.setStavkaCenovnik(stavkaCenovnik1);
		rizik20.setTipRizika(tipRizika7);
		rizik20.setVrednost("Do 50.000€");
		rizikRepository.save(rizik20);
		
		Rizik rizik21 = new Rizik();
		rizik21.setStavkaCenovnik(stavkaCenovnik1);
		rizik21.setTipRizika(tipRizika7);
		rizik21.setVrednost("Do 100.000€");
		rizikRepository.save(rizik21);
		
		Rizik rizik22 = new Rizik();
		rizik22.setStavkaCenovnik(stavkaCenovnik1);
		rizik22.setTipRizika(tipRizika7);
		rizik22.setVrednost("Preko 100.000€");
		rizikRepository.save(rizik22);
		/////////////////////////////////////////
		
		Osoba osoba1 = new Osoba(); 
		osoba1.setIme("Petar");
		osoba1.setPrezime("Petrović");
		osoba1.setJMBG("1234567890123");
		osoba1.setAdresa("Adresa osobe1");
		osobaRepository.save(osoba1);
		
		Osoba osoba2 = new Osoba(); 
		osoba2.setIme("Nikola");
		osoba2.setPrezime("Nikolić");
		osoba2.setJMBG("1234567890123");
		osoba2.setAdresa("Adresa osobe2");
		osobaRepository.save(osoba2);
		
		Osoba osoba3 = new Osoba(); 
		osoba3.setIme("Milica");
		osoba3.setPrezime("Milicić");
		osoba3.setJMBG("1234567890123");
		osoba3.setAdresa("Adresa osobe3");
		osobaRepository.save(osoba3);
		
		Osoba osoba4 = new Osoba(); 
		osoba4.setIme("Žika");
		osoba4.setPrezime("Žikić");
		osoba4.setJMBG("1234567890123");
		osoba4.setAdresa("Adresa osobe4");
		osobaRepository.save(osoba4);
		
		/////////////////////////////////////////////
		
		Osiguranik osiguranik1 = new Osiguranik(); 
		osiguranik1.setBrojPasosa("123456789123456");
		osiguranik1.setBrojTelefona("021123456");
		osiguranik1.setOsoba(osoba1);
		osiguranikRepository.save(osiguranik1); 
		
		Osiguranik osiguranik2 = new Osiguranik(); 
		osiguranik2.setBrojPasosa("123456789123456");
		osiguranik2.setBrojTelefona("021123456");
		osiguranik2.setOsoba(osoba2);
		osiguranikRepository.save(osiguranik2); 
		
		Osiguranik osiguranik3 = new Osiguranik(); 
		osiguranik3.setBrojPasosa("123456789123456");
		osiguranik3.setBrojTelefona("021123456");
		osiguranik3.setOsoba(osoba3);
		osiguranikRepository.save(osiguranik3); 
		
		/////////////////////////////////////////////
		
		Osiguravac osiguravac1 = new Osiguravac(); 
		osiguravac1.setNaziv("Osiguravajuca kuca1");
		osiguravacRepository.save(osiguravac1); 
		
		Osiguravac osiguravac2 = new Osiguravac(); 
		osiguravac2.setNaziv("Osiguravajuce kuca2");
		osiguravacRepository.save(osiguravac2); 
		
		/////////////////////////////////////////////
		
		Polisa polisa1 = new Polisa(); 
		polisa1.setBrOsoba(2);
		polisa1.setEmail("mail1");
		polisa1.setOd(new Date(1504994400000L));	// 10.09.2017
		polisa1.setDoo(new Date(1505858400000L));  	// 20.09.2017
		polisa1.setOsiguranik(osiguranik1);
		polisa1.setOsiguravac(osiguravac1);
		polisaRepository.save(polisa1); 
		
		////////////////////////////////////////////
		
		Faktura faktura1 = new Faktura(); 
		faktura1.setOsiguranik(osiguranik1);
		faktura1.setPolisa(polisa1);
		fakturaRepository.save(faktura1); 
		
		/////////////////////////////////////////////
		
		Stavka stavka1 = new Stavka(); 
		stavka1.setFaktura(faktura1);
		stavka1.setRizik(rizik1);
		stavkaRepository.save(stavka1); 
		
		/////////////////////////////////////////////
		
		Nekretnina nekretnina1 = new Nekretnina(); 
		nekretnina1.setOsoba(osoba1);
		nekretnina1.setPolisa(polisa1);
		nekretninaRepository.save(nekretnina1); 
		
		////////////////////////////////////////////
		
		Marka marka1 = new Marka(); 
		marka1.setNaziv("Marka1");
		markaRepository.save(marka1); 
		
		///////////////////////////////////////////
		
		Model model1 = new Model(); 
		model1.setIme("Model1");
		model1.setMarka(marka1);
		modelRepository.save(model1); 
		
		///////////////////////////////////////////
		
		Vozilo vozilo1 = new Vozilo(); 
		vozilo1.setBrSasije("123456");
		vozilo1.setGodProizvodnje(new Date());
		vozilo1.setJeVlasnik(true);
		vozilo1.setMarka(marka1);
		vozilo1.setModel(model1);
		vozilo1.setOsoba(osoba1);
		vozilo1.setPolisa(polisa1);
		vozilo1.setRegTablice("NS123-456");
		voziloRepository.save(vozilo1); 
		
		System.out.println("DATABASE FILLED");
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
		
		
	
}
