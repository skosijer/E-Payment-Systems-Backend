package sep.tim6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sep.tim6.beans.Faktura;
import sep.tim6.beans.Rizik;
import sep.tim6.beans.Stavka;

@Repository
public interface StavkaRepository extends JpaRepository<Stavka, Integer>{

	Stavka findById(int id);
	List<Stavka> findByFaktura(Faktura faktura);
	List<Stavka> findByRizik(Rizik rizik);
}
