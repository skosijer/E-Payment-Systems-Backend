package dc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dc.insurance.domain.Cenovnik;
import dc.insurance.repo.CenovnikRepository;
import dc.policyAndPayments.domain.Primer;
import dc.policyAndPayments.repo.PrimerRepository;

@RestController
public class InsurancePolicyPaymentController {

	 private final CenovnikRepository cenovnikRepo;
	 private final PrimerRepository primerRepo;

	  @Autowired
	  InsurancePolicyPaymentController(CenovnikRepository cenovnikRepo, PrimerRepository primerRepo){
	    this.cenovnikRepo = cenovnikRepo;
	    this.primerRepo = primerRepo;
	  }

	  @RequestMapping("/insurancePolicyPayment/{id}")
	  public String insurancePolicyPayment(@PathVariable("id") int id) {
	    Cenovnik cenovnik = cenovnikRepo.findById(id);
	    Primer primer = primerRepo.findById(id);

	    return cenovnik.getId() + " " + primer.getId() + "!";
	  }
}