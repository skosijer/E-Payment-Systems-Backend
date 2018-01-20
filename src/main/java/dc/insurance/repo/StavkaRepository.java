package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Rizik;
import dc.insurance.domain.Stavka;

@Repository
public interface StavkaRepository extends JpaRepository<Stavka, Integer>{

	Stavka findById(int id);
	List<Stavka> findByRizik(Rizik rizik);
}
