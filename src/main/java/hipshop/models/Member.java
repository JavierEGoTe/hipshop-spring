package hipshop.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(length =100)
	private String firstName;
	
	@Column(length =100)
	private String lastName;
	
	
	private Date dateBirth;
	
	@Column( length =100)
	private String address;
	
	@Column(nullable = false, length =50)
	private String email;
	
	@Column(nullable = false, length =250)
	private String password;
	
	@Column(length =20)
	private String phoneNumber;
	
	@Column(length =30)
	private String aka;
	
	@OneToMany(mappedBy="user")
	@JsonManagedReference
	private List<Card> cards;
	
	

	public Member() {
	}

	public Member(String firstName, String lastName, Date dateBirth, String address, String email, String password,
			String phoneNumber, String aka, List<Card> cards) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateBirth = dateBirth;
		this.address = address;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.aka = aka;
		this.cards = cards;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAka() {
		return aka;
	}

	public void setAka(String aka) {
		this.aka = aka;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
}