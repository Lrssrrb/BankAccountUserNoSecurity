package user.apps;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User, Integer> {

	public Optional<User> findByName(String name);
	
}
