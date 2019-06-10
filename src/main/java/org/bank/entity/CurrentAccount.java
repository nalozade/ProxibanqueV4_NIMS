package org.bank.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe CurrentAccount herite de la classe Account elle sera définie dans la
 * BD comme type de la table Account
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@DiscriminatorValue("CurrentAcc")
public class CurrentAccount extends Account {

	private static final double OVERDRAFTPERMIT = 1000;

	public CurrentAccount() {
	}

	public CurrentAccount(String accountNumber, double balance, String creationDate) {
		super(accountNumber, balance, creationDate);
	}

	public static double getOverdraftpermit() {
		return OVERDRAFTPERMIT;
	}

}
