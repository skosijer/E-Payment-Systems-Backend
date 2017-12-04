package sep.tim6.insuranceDB.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Kategorija;
import sep.tim6.insuranceDB.beans.TipRizika;

@Repository
public interface TipRizikaRepository extends JpaRepository<TipRizika, Integer>{

	TipRizika findById(int id);
	List<TipRizika> findByNaziv(String naziv);
	List<TipRizika> findByKategorija(Kategorija kategorija);
}
