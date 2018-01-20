package dc.insurance.repo; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Kategorija;

@Repository
public interface KategorijaRepository extends JpaRepository<Kategorija, Integer> {
	

}
