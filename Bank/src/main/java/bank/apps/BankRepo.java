package bank.apps;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Bank, Integer>{
	
	public Optional<Bank> findByIfsc(String ifsc);
}
