package user.apps;

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
@RequestMapping("user")
public class Controller {

	@Autowired
	private Services service;

	@GetMapping("get/{id}")
	public ResponseEntity<User> get(@PathVariable int id) {
		System.out.println(service.getUserById(id));
		User user = service.getUserById(id);
		return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<User>> getAll() {
		return new ResponseEntity<List<User>>(service.getAll(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("save")
	public ResponseEntity<User> save(@RequestBody User user) {
		return new ResponseEntity<User>(service.save(user),HttpStatus.CREATED);
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<User> update(@PathVariable int id,@RequestBody User user) {
		return new ResponseEntity<User>(service.update(id, user),HttpStatus.OK);
	}
	
	@GetMapping("getByName/{name}")
	public ResponseEntity<User> getByName(@PathVariable String name) {
		return new ResponseEntity<User>(service.getByName(name),HttpStatus.ACCEPTED);
	}
	
}

