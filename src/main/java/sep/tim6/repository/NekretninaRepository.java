package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Nekretnina;
import sep.tim6.beans.Osoba;
import sep.tim6.beans.Polisa;

@Repository
public interface NekretninaRepository extends JpaRepository<Nekretnina, Integer> {

	Nekretnina findById(int id);
	List<Nekretnina> findByOsoba(Osoba osoba);
	List<Nekretnina> findByPolisa(Polisa polisa);
}
