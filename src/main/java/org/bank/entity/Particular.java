package org.bank.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
