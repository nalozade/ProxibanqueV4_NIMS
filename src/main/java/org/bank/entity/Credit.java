package org.bank.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Credit herite de la classe BankingOperation elle sera définie dans
 * la BD comme type de la table BankingOperation
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@DiscriminatorValue("Credit")
public class Credit extends BankingOperation {

	public Credit() {
		super();

	}

	public Credit(double amount, String operationDate) {
		super(amount, operationDate);

	}

}
