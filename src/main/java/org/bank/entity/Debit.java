package org.bank.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Debit herite de la classe BankingOperation elle sera définie dans
 * la BD comme type de la table BankingOperation
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@DiscriminatorValue("Debit")
public class Debit extends BankingOperation {

	public Debit() {
		super();

	}

	public Debit(double amount, String operationDate) {
		super(amount, operationDate);

	}

}
