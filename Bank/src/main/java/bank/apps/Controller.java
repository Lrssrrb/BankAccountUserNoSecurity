package bank.apps;


import java.util.List;

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
@RequestMapping("bank")
public class Controller {

	@Autowired
	private Services service;

	@GetMapping("get/{id}")
	public ResponseEntity<Bank> get(@PathVariable int id) {
		System.out.println(service.getBankById(id));
		Bank bank = service.getBankById(id);
		return new ResponseEntity<Bank>(bank,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<Bank>> getAll() {
		return new ResponseEntity<List<Bank>>(service.getAll(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("save")
	public ResponseEntity<Bank> save(@RequestBody Bank bank) {
		return new ResponseEntity<Bank>(service.save(bank),HttpStatus.CREATED);
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Bank> update(@PathVariable int id,@RequestBody Bank bank) {
		return new ResponseEntity<Bank>(service.update(id, bank),HttpStatus.OK);
	}
	
	@GetMapping("getByIfsc/{ifsc}")
	public ResponseEntity<Bank> getByIfsc(@PathVariable String ifsc) {
		return new ResponseEntity<Bank>(service.getByIfsc(ifsc),HttpStatus.ACCEPTED);
	}
	
}
