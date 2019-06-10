package org.bank.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Enterprise herite de la classe Customer elle sera définie dans la
 * BD comme type de la table Customer
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
@DiscriminatorValue("Enterprise")
public class Enterprise extends Customer {

	public Enterprise() {
		super();

	}

	public Enterprise(Long id, String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email, Advisor advisor, List<Account> accountList) {
		super(id, firstname, lastname, address, postalCode, city, telephone, email, advisor, accountList);

	}

	public Enterprise(String firstname, String lastname, String address, String postalCode, String city,
			String telephone, String email) {
		super(firstname, lastname, address, postalCode, city, telephone, email);

	}

}
