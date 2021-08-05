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

import lombok.Getter;
import lombok.Setter;

@Entity
public class Vendor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String lastName;

	private String email;

	private String password;
	
	private Date dateBirth;
	
	private String address;

	private String aka;

	private Integer bankAccount;

	private String bankName;
	
	private Integer phoneNumber;
	
	
	@OneToMany(mappedBy="vendor")
	@JsonManagedReference
	private List<Product> products;
	
	
	
	public Vendor() {
	}

	
	
	public Vendor(String firstName) {
		super();
		this.firstName = firstName;
	}



	public Vendor(String firstName, String lastName, String email, String password, Date dateBirth, String address,
			String aka, Integer bankAccount, String bankName, Integer phoneNumber, List<Product> products) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dateBirth = dateBirth;
		this.address = address;
		this.aka = aka;
		this.bankAccount = bankAccount;
		this.bankName = bankName;
		this.phoneNumber = phoneNumber;
		this.products = products;
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



	public List<Product> getProducts() {
		return products;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
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



	public String getAka() {
		return aka;
	}



	public void setAka(String aka) {
		this.aka = aka;
	}



	public Integer getBankAccount() {
		return bankAccount;
	}



	public void setBankAccount(Integer bankAccount) {
		this.bankAccount = bankAccount;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public Integer getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public void setProducts(List<Product> products) {
		this.products = products;
	}



	
	
}
