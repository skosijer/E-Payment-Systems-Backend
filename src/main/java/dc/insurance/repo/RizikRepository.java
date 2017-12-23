package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Rizik;
import dc.insurance.domain.StavkaCenovnik;
import dc.insurance.domain.TipRizika;

@Repository
public interface RizikRepository extends JpaRepository<Rizik, Integer> {

	Rizik findById(int id);
	List<Rizik> findByVrednost(String vrednost);
	List<Rizik> findByTipRizika(TipRizika tipRizika);
	List<Rizik> findByStavkaCenovnik(StavkaCenovnik stavkaCenovnik);
}
