package dc.insurance.rest;

import dc.insurance.domain.Rizik;
import dc.insurance.domain.TipRizika;
import dc.insurance.repo.RizikRepository;
import dc.insurance.repo.TipRizikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dcRizici")
public class RiziciController {

    @Autowired
    private TipRizikaRepository tipRizikaRepository;

    @Autowired
    private RizikRepository rizikRepository;

//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviStarosneGrupe")
//    public ResponseEntity<?> dobaviStarosneGrupe() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Starost");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviRegione")
//    public ResponseEntity<?> dobaviDestinacije() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Region");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviSvrheOsiguranja")
//    public ResponseEntity<?> dobaviSvrheOsiguranja() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Sport");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviPaketeOsiguranja")
//    public ResponseEntity<?> dobaviPaketeOsiguranja() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Paket");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviStarostiStana")
//    public ResponseEntity<?> dobaviStarostiStana() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Starost stana");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
//
//
//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviProcenjeneVrednostiStana")
//    public ResponseEntity<?> dobaviProcenjeneVrednostiStana() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Procenjena vrednost stana");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
//
//    @RequestMapping(method = RequestMethod.GET, value = "/dobaviOsiguranjaStana")
//    public ResponseEntity<?> dobaviOsiguranjaStana() {
//
//        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Osiguranja stana");
//
//        if(list.size() == 0)
//            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);
//
//        TipRizika tipRizika = list.get(0);
//        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);
//
//        return new ResponseEntity<>(ret, HttpStatus.OK);
//    }
}
