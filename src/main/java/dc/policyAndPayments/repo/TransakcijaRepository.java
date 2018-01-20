package dc.policyAndPayments.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.policyAndPayments.domain.Transakcija;

@Repository
public interface TransakcijaRepository extends JpaRepository<Transakcija, Long>{
	Transakcija findById(int id);
}

