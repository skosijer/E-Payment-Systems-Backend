package sep.tim6.insuranceDB.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Marka;
import sep.tim6.insuranceDB.beans.Model;
import sep.tim6.insuranceDB.beans.Osoba;
import sep.tim6.insuranceDB.beans.Polisa;
import sep.tim6.insuranceDB.beans.Vozilo;

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