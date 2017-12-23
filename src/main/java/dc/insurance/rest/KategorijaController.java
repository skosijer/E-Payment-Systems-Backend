package dc.insurance.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dc.insurance.domain.Kategorija;
import dc.insurance.service.KategorijaService;

@RestController
@RequestMapping("/kategorija")
public class KategorijaController {

	@Autowired 
	private KategorijaService kategorijaService; 
	
	@RequestMapping(method = RequestMethod.GET, value = "/dobaviKategoriju/{guest-id}")
	public ResponseEntity<?> getGuestFriendsInfo(@PathVariable(value = "guest-id") int id) {
		Kategorija kategorija = kategorijaService.dobaviKategoriju(id);

		return new ResponseEntity<>(kategorija, HttpStatus.OK);

	}
	
}
