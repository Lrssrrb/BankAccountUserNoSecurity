package bank.apps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String branch;
	private String ifsc;
	
	public Bank(String name, String branch, String ifsc) {
		super();
		this.name = name;
		this.branch = branch;
		this.ifsc = ifsc;
	}
	
}
