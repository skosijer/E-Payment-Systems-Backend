package sep.tim6.insuranceDB.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.insuranceDB.beans.Osiguravac;

@Repository
public interface OsiguravacRepository extends JpaRepository<Osiguravac, Integer>{

	Osiguravac findById(int id);
	Osiguravac findByNaziv(String naziv);
}
