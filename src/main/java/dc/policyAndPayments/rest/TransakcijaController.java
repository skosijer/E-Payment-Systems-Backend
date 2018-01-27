package dc.policyAndPayments.rest;

import java.math.BigDecimal;
import java.net.URISyntaxException;
import java.util.Date;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import dc.insurance.DTO.PolisaDTO;
import dc.insurance.DTO.ResponseDTO;
import dc.policyAndPayments.domain.StanjeTransakcije;
import dc.policyAndPayments.domain.Transakcija;
import dc.policyAndPayments.repo.TransakcijaRepository;

@RestController
@RequestMapping("/dcTransakcije")
public class TransakcijaController {
	
	@Value("${error.origin.name}")
	private String errorOriginName;

	@Autowired
	private TransakcijaRepository transakcijaRepository; 
	
	private final Log logger = LogFactory.getLog(this.getClass());

	//PROMENITI DA BUDE POLISA DTO
	@RequestMapping(value = "/logBeginOfTransaction", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity<?> logBeginOfTransaction(@RequestBody @Valid PolisaDTO polisaDTO) throws URISyntaxException {

		Transakcija transakcija = new Transakcija();
		transakcija.setStanjeTransakcije(StanjeTransakcije.Zapoceta);
		transakcija.setIznosTransakcije(new BigDecimal("1000.0"));

		//TODO u pretodnog koraku kada bude postojao dobar Model
		// izracunati cenu polise...
		//transakcija.setIznosTransakcije(osiguranjeDTO.get);
		transakcija = transakcijaRepository.save(transakcija);
		CreateTransakcijaDTO dto = new CreateTransakcijaDTO();
		dto.setId(transakcija.getId());
		dto.setTimestamp(new Date());
		dto.setIznosTransakcije(transakcija.getIznosTransakcije());

		if (transakcija != null) {
			return ResponseEntity.ok(dto);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/logEndOfTransaction", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public ResponseEntity<?> logEndOfTransaction(@RequestBody ResponseDTO responseDTO) throws URISyntaxException {
		
		
		Transakcija transakcija = transakcijaRepository.findById(responseDTO.getTransactionIdMerchant());
		
		if(!responseDTO.getSuccess()){
			transakcija.setStanjeTransakcije(StanjeTransakcije.Ponistena);
			transakcija.setRazlog(responseDTO.getReason());
		}
		else {
			transakcija.setStanjeTransakcije(StanjeTransakcije.Proknjizena);
		}
		
		//TODO u pretodnog koraku kada bude postojao dobar Model
		// izracunati cenu polise...
		//transakcija.setIznosTransakcije(osiguranjeDTO.get);
		transakcija = transakcijaRepository.save(transakcija); 
		
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<?> exceptionHandlerHttpError(HttpClientErrorException ex) {
		String body = ex.getResponseBodyAsString();
		RestClientExceptionInfo info = new RestClientExceptionInfo(); 
		
		
		if(RestClientExceptionInfo.parse(body) == null) {
			//ova aplikacija je uzrok exceptiona
			//priprema se exception za propagiranje dalje i loguje se
			info.setOrigin(errorOriginName);
			info.setInfo(body);
		}
		else {
			info.setOrigin(RestClientExceptionInfo.parse(body).getOrigin() );
			info.setInfo(RestClientExceptionInfo.parse(body).getInfo() );
		}
		logger.error("HttpClientErrorException, info:" + RestClientExceptionInfo.toJSON(info));
		
		
		return ResponseEntity.status(ex.getStatusCode()).body(RestClientExceptionInfo.toJSON(info));
	}
}