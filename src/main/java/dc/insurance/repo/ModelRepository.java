package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Marka;
import dc.insurance.domain.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer>{

	Model findById(int id);
	List<Model> findByIme(String ime);
	List<Model> findByMarka(Marka marka);
}
