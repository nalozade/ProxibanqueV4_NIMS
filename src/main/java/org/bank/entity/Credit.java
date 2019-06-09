package org.bank.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Credit")
public class Credit extends BankingOperation{

	public Credit() {
		super();
		
	}

	public Credit(double amount, String operationDate) {
		super(amount, operationDate);
		
	}


}
