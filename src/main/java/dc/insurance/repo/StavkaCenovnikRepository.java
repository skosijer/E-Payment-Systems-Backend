package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Cenovnik;
import dc.insurance.domain.StavkaCenovnik;

@Repository
public interface StavkaCenovnikRepository extends JpaRepository<StavkaCenovnik, Integer>{

	StavkaCenovnik findById(int id);
	List<StavkaCenovnik> findByIznos(double iznos);
	List<StavkaCenovnik> findByCenovnik(Cenovnik cenovnik);
}