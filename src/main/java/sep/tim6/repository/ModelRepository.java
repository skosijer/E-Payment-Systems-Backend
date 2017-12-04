package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Marka;
import sep.tim6.beans.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>{

	Model findById(int id);
	List<Model> findByIme(String ime);
	List<Model> findByMarka(Marka marka);
}
