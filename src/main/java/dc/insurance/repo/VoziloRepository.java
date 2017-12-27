package dc.insurance.repo; 

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Marka;
import dc.insurance.domain.Model;
import dc.insurance.domain.Osoba;
import dc.insurance.domain.Polisa;
import dc.insurance.domain.Vozilo;

@Repository
public interface VoziloRepository extends JpaRepository<Vozilo, Integer>{

	Vozilo findById(int id);
	List<Vozilo> findByGodProizvodnje(Date godProizvodnje);
	Vozilo findByRegTablice(String regTablice);
	Vozilo findByBrSasije(String brSasije);
	List<Vozilo> findByOsoba(Osoba osoba);
	List<Vozilo> findByPolisa(Polisa polisa); 
	List<Vozilo> findByMarka(Marka marka); 
	List<Vozilo> findByModel(Model model);
}