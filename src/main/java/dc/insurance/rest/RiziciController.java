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

    @RequestMapping(method = RequestMethod.GET, value = "/dobaviStarosneGrupe")
    public ResponseEntity<?> dobaviStarosneGrupe() {

        List<TipRizika> list = this.tipRizikaRepository.findByNaziv("Starost");

        if(list.size() == 0)
            return new ResponseEntity<>("nema rizika", HttpStatus.NOT_FOUND);

        TipRizika tipRizika = list.get(0);
        List<Rizik> ret = this.rizikRepository.findByTipRizika(tipRizika);

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }

}
