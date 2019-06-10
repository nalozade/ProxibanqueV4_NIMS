package org.bank.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * La classe SavingsAccount herite de la classe Account elle sera définie dans la
 * BD comme type de la table Account
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@DiscriminatorValue("SavingsAcc")
public class SavingsAccount extends Account {

	private static final double INTERESTRATE = 0.03;

	public SavingsAccount() {
	}

	public SavingsAccount(String accountNumber, double balance, String creationDate) {
		super(accountNumber, balance, creationDate);

	}

	public static double getInterestrate() {
		return INTERESTRATE;
	}

}
