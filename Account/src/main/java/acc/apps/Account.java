package acc.apps;

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
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String accNumber;
	private String type;
	private float balance;
	private String holdername;
	private String mobNumber;
	
	public Account(String accNumber, String type, String holdername, String mobNumber) {
		super();
		this.accNumber = accNumber;
		this.type = type;
		this.balance = 0.0f;
		this.holdername = holdername;
		this.mobNumber = mobNumber;
	}
	
}
