package org.bank.entity;

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

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * La classe BankingOperation est un javabean, elle est canditate a etre
 * persitée elle est classe mère de Credit et Debit
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Operation_Type", discriminatorType = DiscriminatorType.STRING)
public class BankingOperation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long operationNumber;
	private double amount;
	private String operationDate;

	@JsonBackReference
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "account_id")
	private Account account;

	public BankingOperation() {
		super();
	}

	public BankingOperation(double amount, String operationDate) {
		super();
		this.amount = amount;
		this.operationDate = operationDate;
	}

	public Long getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(Long operationNumber) {
		this.operationNumber = operationNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "BankingOperation [operationNumber=" + operationNumber + ", amount=" + amount + ", operationDate="
				+ operationDate + ", account=" + account + "]";
	}

}
