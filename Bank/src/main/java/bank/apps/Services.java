package bank.apps;

import java.util.List;


public interface Services {
	
	public Bank save(Bank acc);
	public Bank getBankById(int id);
	public List<Bank> getAll();
	public Bank update(int id,Bank acc);
	public String delete(int id);
	public Bank getByIfsc(String ifsc);
	
}
