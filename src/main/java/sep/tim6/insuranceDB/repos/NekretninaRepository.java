package sep.tim6.insuranceDB.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Nekretnina;
import sep.tim6.insuranceDB.beans.Osoba;
import sep.tim6.insuranceDB.beans.Polisa;

@Repository
public interface NekretninaRepository extends JpaRepository<Nekretnina, Integer> {

	Nekretnina findById(int id);
	List<Nekretnina> findByOsoba(Osoba osoba);
	List<Nekretnina> findByPolisa(Polisa polisa);
}
