package dc.insurance.repo; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Polisa;

@Repository
public interface PolisaRepository extends JpaRepository<Polisa, Integer>{

}
