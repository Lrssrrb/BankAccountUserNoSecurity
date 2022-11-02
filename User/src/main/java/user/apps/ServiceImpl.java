package user.apps;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl implements Services{

	@Autowired
	UserRepo repo;
	
	@Override
	public User save(User user) {
		return repo.save(user);
	}

	@Override
	public User getUserById(int id) {
		Optional<User> user = repo.findById(id);
		if(user.isEmpty())
			throw new NotFoundExeption("No user found with id "+id);
		return user.get();
	}

	@Override
	public List<User> getAll() {
		return repo.findAll();
	}

	@Override
	public User update(int id, User newuser) {
		Optional<User> user = repo.findById(id);
		if(user.isEmpty())
			throw new NotFoundExeption("No user found with id "+id);
		newuser.setId(id);
		return repo.save(newuser);
	}

	@Override
	public String delete(int id) {
		Optional<User> user = repo.findById(id);
		if(user.isEmpty())
			throw new NotFoundExeption("No user found with id "+id);
		repo.delete(user.get());
		return "User with id "+id +" has been deleted.";
	}

	@Override
	public User getByName(String name) {
		Optional<User> user = repo.findByName(name);
		if(user.isEmpty())
			throw new NotFoundExeption("No user found with name "+name);
		return user.get();
	}

}
