package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Faktura;
import dc.insurance.domain.Osiguranik;
import dc.insurance.domain.Polisa;

@Repository
public interface FakturaRepository extends JpaRepository<Faktura, Integer>{
	
	Faktura findById(int id);
	List<Faktura> findByOsiguranik(Osiguranik osiguranik);
	List<Faktura> findByPolisa(Polisa polisa);

}
