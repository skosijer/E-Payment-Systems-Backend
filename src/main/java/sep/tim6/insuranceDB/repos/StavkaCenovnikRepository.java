package sep.tim6.insuranceDB.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Cenovnik;
import sep.tim6.insuranceDB.beans.StavkaCenovnik;

@Repository
public interface StavkaCenovnikRepository extends JpaRepository<StavkaCenovnik, Integer>{

	StavkaCenovnik findById(int id);
	List<StavkaCenovnik> findByIznos(double iznos);
	List<StavkaCenovnik> findByCenovnik(Cenovnik cenovnik);
}