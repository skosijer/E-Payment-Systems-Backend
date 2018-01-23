package dc.insurance.repo; 

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Integer> {

}








