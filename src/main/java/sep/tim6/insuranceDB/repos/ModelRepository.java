package sep.tim6.insuranceDB.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Marka;
import sep.tim6.insuranceDB.beans.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>{

	Model findById(int id);
	List<Model> findByIme(String ime);
	List<Model> findByMarka(Marka marka);
}
