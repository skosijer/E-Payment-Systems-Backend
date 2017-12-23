package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Osiguranik;
import dc.insurance.domain.Osoba;

@Repository
public interface OsiguranikRepository extends JpaRepository<Osiguranik, Integer> {

	Osiguranik findById(int id);
	Osiguranik findByBrojPasosa(String brojPasosa);
	Osiguranik findByBrojTelefona(String brojTelefona); 
	List<Osiguranik> findByOsoba(Osoba osoba);
}
