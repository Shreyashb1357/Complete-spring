package example.hibernate.associations.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person_Master")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private Integer personId;
	@Column(name = "person_name", length = 50)
	private String name;
	@Column(name = "person_email", length = 50)
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_no")//Indicates the foreign key column from Person_Master referring to primary key column from Passport_Master
	private Passport passportDetails;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(Integer personId, String name, String email, Passport passportDetails) {
		super();
		this.personId = personId;
		this.name = name;
		this.email = email;
		this.passportDetails = passportDetails;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Passport getPassportDetails() {
		return passportDetails;
	}
	public void setPassportDetails(Passport passportDetails) {
		this.passportDetails = passportDetails;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", email=" + email + ", passportDetails="
				+ passportDetails + "]";
	}
}
