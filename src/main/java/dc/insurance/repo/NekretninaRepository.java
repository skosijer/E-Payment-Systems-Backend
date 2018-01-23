package dc.insurance.repo; 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.insurance.domain.Nekretnina;
import dc.insurance.domain.Osoba;
import dc.insurance.domain.Polisa;

@Repository
public interface NekretninaRepository extends JpaRepository<Nekretnina, Integer> {

}
