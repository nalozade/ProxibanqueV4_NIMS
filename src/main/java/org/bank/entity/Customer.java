package org.bank.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * La classe Customer est un javabean qui regroupe toutes les informations
 * concernant un client elle est classe mère de la classe Enterprise et la
 * classe Particular
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Customer_Type", discriminatorType = DiscriminatorType.STRING)
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private String address;
	private String postalCode;
	private String city;
	private String telephone;
	private String email;

	// @JsonBackReference
	@JsonIgnore
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "advisor_id")
	private Advisor advisor;

	@JsonManagedReference
	@OneToMany(mappedBy = "customer", cascade = { CascadeType.ALL })
	private List<Account> accountList = new ArrayList<>();

	// Constructeur

	public Customer() {
	}

	public Customer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Customer(String firstname, String lastname, String address, String postalCode, String city, String telephone,
			String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.telephone = telephone;
		this.email = email;
	}

	public Customer(Long id, String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email, Advisor advisor, List<Account> accountList) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
		this.telephone = telephone;
		this.email = email;
		this.advisor = advisor;
		this.accountList = accountList;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Advisor getAdvisor() {
		return advisor;
	}

	public void setAdvisor(Advisor advisor) {
		this.advisor = advisor;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", postalCode=" + postalCode + ", city=" + city + ", telephone=" + telephone + ", email=" + email
				+ "]";
	}

}
