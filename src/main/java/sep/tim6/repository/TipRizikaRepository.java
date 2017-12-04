package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Kategorija;
import sep.tim6.beans.TipRizika;

@Repository
public interface TipRizikaRepository extends JpaRepository<TipRizika, Integer>{

	TipRizika findById(int id);
	List<TipRizika> findByNaziv(String naziv);
	List<TipRizika> findByKategorija(Kategorija kategorija);
}
