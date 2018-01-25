package dc.insurance.repo; 

import dc.insurance.domain.TipRizika;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Rizik;

import java.util.List;

@Repository
public interface RizikRepository extends JpaRepository<Rizik, Integer> {

    List<Rizik> findByTipRizika(TipRizika tipRizika);
    List<Rizik> findByIdRizikIn(List<Integer> ids);

}
