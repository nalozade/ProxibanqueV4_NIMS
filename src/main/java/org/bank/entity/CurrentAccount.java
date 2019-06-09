package org.bank.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CurrentAcc")
public class CurrentAccount extends Account{

	private static final double OVERDRAFTPERMIT = 1000;
	 //relation entre customer et passport(1,1)
	
	// Constructeur

	public CurrentAccount() {
	}

	

	public CurrentAccount(String accountNumber, double balance, String creationDate) {
		super(accountNumber, balance, creationDate);
		// TODO Auto-generated constructor stub
	}



	// Getter
	public static double getOverdraftpermit() {
		return OVERDRAFTPERMIT;
	}

	


}
