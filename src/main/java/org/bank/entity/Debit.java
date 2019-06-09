package org.bank.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Debit")
public class Debit extends BankingOperation{

	public Debit() {
		super();
		
	}

	public Debit(double amount, String operationDate) {
		super(amount, operationDate);
		
	}




}
