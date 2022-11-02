package acc.apps;


import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("account")
public class Controller {
	
	@Autowired
	private Services service;

	@GetMapping("get/{id}")
	public ResponseEntity<Account> get(@PathVariable int id) {
		System.out.println(service.getAccountById(id));
		Account account = service.getAccountById(id);
		return new ResponseEntity<Account>(account,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<Account>> getAll() {
		return new ResponseEntity<List<Account>>(service.getAll(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("save")
	public ResponseEntity<Account> save(@RequestBody Account account) {
		return new ResponseEntity<Account>(service.save(account),HttpStatus.CREATED);
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Account> update(@PathVariable int id,@RequestBody Account account) {
		return new ResponseEntity<Account>(service.update(id, account),HttpStatus.OK);
	}
	
	@GetMapping("getByAccNumber/{accNum}")
	public ResponseEntity<Account> getByAccNum(@PathVariable String accNum) {
		return new ResponseEntity<Account>(service.findByAccountNumber(accNum),HttpStatus.ACCEPTED);
	}
}
