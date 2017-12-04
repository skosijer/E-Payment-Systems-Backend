package sep.tim6.repository;

import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sep.tim6.beans.Cenovnik;

@Repository
public interface CenovnikRepository extends JpaRepository<Cenovnik, Integer> {

	Cenovnik findById(int id);
	Cenovnik findByOd(Date od);
	Cenovnik findByDoo(Date doo);	
}








