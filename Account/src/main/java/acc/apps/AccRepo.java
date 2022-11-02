package acc.apps;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccRepo extends JpaRepository<Account, Integer>{

	public Optional<Account> findByAccNumber(String accNumber);
	
}
