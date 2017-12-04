package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Osoba;

@Repository
public interface OsobaRepository extends JpaRepository<Osoba, Integer>{

	Osoba findById(int id);
	List<Osoba> findByIme(String ime);
	List<Osoba> findByPrezime(String prezime);
	Osoba findByJMBG(String JMBG);
	List<Osoba> findByAdresa(String adresa);
}
