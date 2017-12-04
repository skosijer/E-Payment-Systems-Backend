package sep.tim6.insuranceDB.repos;

import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sep.tim6.insuranceDB.beans.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Integer> {

	Cenovnik findById(int id);
	Cenovnik findByOd(Date od);
	Cenovnik findByDoo(Date doo);	
}








