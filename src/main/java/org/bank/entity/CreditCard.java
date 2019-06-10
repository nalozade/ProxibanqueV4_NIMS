package org.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * La classe CreditCard est un javabean qui regroupe les informations concernant
 * un carte de credit son id et son type
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
@Entity
public class CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCard;
	private String type;

//	@OneToOne(mappedBy = "creditCard", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
//	private Account account;

	public Long getIdCard() {
		return idCard;
	}

	public void setIdCard(Long idCard) {
		this.idCard = idCard;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
//	// Constructeur
//	public CreditCard(String type, Account account) {
//		super();
//		this.type = type;
//		this.account = account;
//	}

	public CreditCard(String type) {
		super();
		this.type = type;
	}

}