package dc.insurance.repo; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Rizik;

@Repository
public interface RizikRepository extends JpaRepository<Rizik, Integer> {

}
