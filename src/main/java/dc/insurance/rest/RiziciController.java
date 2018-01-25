package dc.insurance.rest;

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

import dc.insurance.DTO.PolisaDTO;
import dc.insurance.domain.Rizik;
import dc.insurance.domain.TipRizika;
import dc.insurance.repo.RizikRepository;
import dc.insurance.repo.TipRizikaRepository;

@RestController
@CrossOrigin
@RequestMapping("/dcRizici")
public class RiziciController {

	@Autowired
    private TipRizikaRepository tipRizikaRepository;

    @Autowired
    private RizikRepository rizikRepository;
    
    @PostMapping(value = "/polisa")
    public ResponseEntity<?> postPolisa(@RequestBody PolisaDTO polisa) {
 
    	
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
