package user.apps;

import java.util.List;


public interface Services {

	public User save(User user);
	public User getUserById(int id);
	public List<User> getAll();
	public User update(int id,User user);
	public String delete(int id);
	public User getByName(String name);
	
}
