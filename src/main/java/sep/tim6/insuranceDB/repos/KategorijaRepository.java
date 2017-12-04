package sep.tim6.insuranceDB.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Kategorija;

@Repository
public interface KategorijaRepository extends JpaRepository<Kategorija, Integer> {
	
	Kategorija findById(int id);
	Kategorija findByNaziv(String naziv);

}
