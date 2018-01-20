package dc.insurance.repo; 

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Osoba;
import dc.insurance.domain.Polisa;
import dc.insurance.domain.Vozilo;

@Repository
public interface VoziloRepository extends JpaRepository<Vozilo, Integer>{

}
