package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Faktura;
import sep.tim6.beans.Osiguranik;
import sep.tim6.beans.Polisa;

@Repository
public interface FakturaRepository extends JpaRepository<Faktura, Integer>{
	
	Faktura findById(int id);
	List<Faktura> findByOsiguranik(Osiguranik osiguranik);
	List<Faktura> findByPolisa(Polisa polisa);

}
