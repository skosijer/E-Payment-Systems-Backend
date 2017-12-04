package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Osiguranik;
import sep.tim6.beans.Osoba;

@Repository
public interface OsiguranikRepository extends JpaRepository<Osiguranik, Integer> {

	Osiguranik findById(int id);
	Osiguranik findByBrojPasosa(String brojPasosa);
	Osiguranik findByBrojTelefona(String brojTelefona); 
	List<Osiguranik> findByOsoba(Osoba osoba);
}
