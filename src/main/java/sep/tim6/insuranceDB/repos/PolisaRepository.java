package sep.tim6.insuranceDB.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Osiguranik;
import sep.tim6.insuranceDB.beans.Osiguravac;
import sep.tim6.insuranceDB.beans.Polisa;

@Repository
public interface PolisaRepository extends JpaRepository<Polisa, Integer>{

	Polisa findById(int id);
	List<Polisa> findByOd(Date od);
	List<Polisa> findByDoo(Date doo);
	List<Polisa> findByBrOsoba(int brOsoba);
	List<Polisa> findByEmail(String email);
	List<Polisa> findByOsiguranik(Osiguranik osiguranik);
	List<Polisa> findByOsiguravac(Osiguravac osiguravac);
}
