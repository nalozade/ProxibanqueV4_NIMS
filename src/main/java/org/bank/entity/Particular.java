package org.bank.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Particular herite de la classe Customer elle sera définie dans la
 * BD comme type de la table Customert
 * 
 * @author Nawal et Maxime
 */
@Entity
@DiscriminatorValue("Particular")
public class Particular extends Customer {

	public Particular() {
		super();

	}

	public Particular(Long id, String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email, Advisor advisor, List<Account> accountList) {
		super(id, firstname, lastname, address, postalCode, city, telephone, email, advisor, accountList);

	}

	public Particular(String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email) {
		super(firstname, lastname, address, postalCode, city, telephone, email);

	}

}
