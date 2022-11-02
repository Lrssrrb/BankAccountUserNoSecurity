package acc.apps;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Services{
	
	@Autowired
	private AccRepo accRepo;

	@Override
	public Account save(Account acc) {
		return accRepo.save(acc);
	}

	@Override
	public Account getAccountById(int id) {
		Optional<Account> a = accRepo.findById(id);
		if(a.isEmpty()) {
			throw new NotFoundExeption("no Account is found with id : "+id);
		}
		return a.get();
	}

	@Override
	public List<Account> getAll() {
		return accRepo.findAll();
	}

	@Override
	public Account update(int id, Account acc) {
		Optional<Account> a = accRepo.findById(id);
		if(a.isEmpty()) {
			throw new NotFoundExeption("no Account is found with id : "+id);
		}
		acc.setId(id);
		return acc;
	}

	@Override
	public String delete(int id) {
		Optional<Account> a = accRepo.findById(id);
		if(a.isEmpty()) {
			throw new NotFoundExeption("no Account is found with id : "+id);
		}
		accRepo.deleteById(id);
		return "Account with id "+id +" has been deleted.";
	}

	@Override
	public Account findByAccountNumber(String accNumber) {
		Optional<Account> a = accRepo.findByAccNumber(accNumber);
		if(a.isEmpty()) {
			throw new NotFoundExeption("no Account is found with Account Number : "+accNumber);
		}
		
		return a.get();
	}

}
