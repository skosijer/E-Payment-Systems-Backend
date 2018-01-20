package dc.policyAndPayments.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dc.policyAndPayments.domain.Primer;

@Repository
public interface PrimerRepository extends JpaRepository<Primer, Long> {
	Primer findById(int id);
}