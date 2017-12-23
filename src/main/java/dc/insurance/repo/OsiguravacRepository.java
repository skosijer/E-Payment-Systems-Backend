package dc.insurance.repo; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Osiguravac;

@Repository
public interface OsiguravacRepository extends JpaRepository<Osiguravac, Integer>{

	Osiguravac findById(int id);
	Osiguravac findByNaziv(String naziv);
}
