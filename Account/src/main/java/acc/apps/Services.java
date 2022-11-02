package acc.apps;

import java.util.List;


public interface Services {

	public Account save(Account acc);
	public Account getAccountById(int id);
	public List<Account> getAll();
	public Account update(int id,Account acc);
	public String delete(int id);
	public Account findByAccountNumber(String accNumber);
}
