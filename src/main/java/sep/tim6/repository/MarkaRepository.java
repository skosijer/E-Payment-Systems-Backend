package sep.tim6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Marka;

@Repository
public interface MarkaRepository extends JpaRepository<Marka, Integer> {

	Marka findById(int id);
	Marka findByNaziv(String naziv);
}
