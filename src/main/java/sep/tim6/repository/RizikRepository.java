package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Rizik;
import sep.tim6.beans.StavkaCenovnik;
import sep.tim6.beans.TipRizika;

@Repository
public interface RizikRepository extends JpaRepository<Rizik, Integer> {

	Rizik findById(int id);
	List<Rizik> findByVrednost(String vrednost);
	List<Rizik> findByTipRizika(TipRizika tipRizika);
	List<Rizik> findByStavkaCenovnik(StavkaCenovnik stavkaCenovnik);
}
