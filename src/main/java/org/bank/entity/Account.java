package org.bank.entity;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
/**
 * La classe Account est un javabean elle est canditate a etre persitée
 * elle est classe mère de CurrentAccount et SavingsAccount
 * 
 *  @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Account_Type", discriminatorType = DiscriminatorType.STRING)
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAccount;
	private String accountNumber;
	private double balance;
	private String creationDate;

	@JsonBackReference
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "client_id")
	private Customer customer;

//	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
//	@JoinColumn(name = "creditcard_id", unique = true)
//	private CreditCard creditCard;

@JsonManagedReference
	@OneToMany(mappedBy = "account", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private List<BankingOperation> ListOp = new ArrayList<>();
	// Constructeur

	public Account() {
	}

	public Account(Long idAccount, String accountNumber, double balance, String creationDate, Customer customer) {
		this.idAccount = idAccount;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.creationDate = creationDate;
		// this.customer = customer;
	}

	public Account(String accountNumber, double balance, String creationDate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	// Getters and Setters
	public Long getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Long idAccount) {
		this.idAccount = idAccount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
//
//	public CreditCard getCreditCard() {
//		return creditCard;
//	}

//	public void setCreditCard(CreditCard creditCard) {
//		this.creditCard = creditCard;
//	}

	public List<BankingOperation> getListOp() {
		return ListOp;
	}

	public void setListOp(List<BankingOperation> listOp) {
		ListOp = listOp;
	}

	

//	@Override
//	public String toString() {
//		return "Account [idAccount=" + idAccount + ", accountNumber=" + accountNumber + ", balance=" + balance
//				+ ", creationDate=" + creationDate + ", customer=" + customer + ", creditCard=" + creditCard
//				+ ", ListOp=" + ListOp + "]";
//	}

	// toString

}
