package user.apps;

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
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String bank;
	private String accNumber;
	private String mobNumber;
	
	public User(String name, String bank, String accNumber, String mobNumber) {
		super();
		this.name = name;
		this.bank = bank;
		this.accNumber = accNumber;
		this.mobNumber = mobNumber;
	}
	
}
