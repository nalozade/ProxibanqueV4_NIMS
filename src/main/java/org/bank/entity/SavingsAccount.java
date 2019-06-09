package org.bank.entity;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SavingsAcc")
public class SavingsAccount extends Account{

	private static final double INTERESTRATE = 0.03;

	// Constructeur

	public SavingsAccount() {
	}

	
	
	// Getters and setters

	public SavingsAccount(String accountNumber, double balance, String creationDate) {
		super(accountNumber, balance, creationDate);
		
	}



	public static double getInterestrate() {
		return INTERESTRATE;
	}

}
