package bank.apps;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Services {

	@Autowired
	BankRepo bankRepo;
	
	@Override
	public Bank save(Bank bank) {
		return bankRepo.save(bank);
	}

	@Override
	public Bank getBankById(int id) {
		Optional<Bank> bank = bankRepo.findById(id);
		if(bank.isEmpty()) {
			throw new NotFoundExeption("no Bank is found with id : "+id);
		}
		return bank.get();
	}

	@Override
	public List<Bank> getAll() {

		return bankRepo.findAll();
	}

	@Override
	public Bank update(int id, Bank acc) {
		Optional<Bank> bank = bankRepo.findById(id);
		if(bank.isEmpty()) {
			throw new NotFoundExeption("no Bank is found with id : "+id);
		}
		acc.setId(id);
		return bankRepo.save(acc);
	}

	@Override
	public String delete(int id) {
		Optional<Bank> bank = bankRepo.findById(id);
		if(bank.isEmpty()) {
			throw new NotFoundExeption("no Bank is found with id : "+id);
		}
		bankRepo.deleteById(id);
		return "Bank with id "+id +" has been deleted.";
	}

	@Override
	public Bank getByIfsc(String ifsc) {
		Optional<Bank> a = bankRepo.findByIfsc(ifsc);
		if(a.isEmpty()) {
			throw new NotFoundExeption("no Bank is found with IFSC Number : "+ifsc);
		}
		
		return a.get();
	}

}
