package dc.insurance.repo; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Marka;

@Repository
public interface MarkaRepository extends JpaRepository<Marka, Integer> {

	Marka findById(int id);
	Marka findByNaziv(String naziv);
}
