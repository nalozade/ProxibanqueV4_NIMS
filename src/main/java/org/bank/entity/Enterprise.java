package org.bank.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Enterprise")
public class Enterprise extends Customer{

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
