package org.bank.service;

import org.bank.entity.Account;

public interface IOperationService {

	
	/**
	 * Methode qui permet d'effectuer un depot
	 * 
	 * @param double amount Account account
	 */
	public void deposit(double amount, Account account);

	/**
	 * Methode qui permet d'effectuer un retrait
	 * 
	 * @param double m Account account
	 */
	public void withdraw(double amount, Account account);

	/**
	 * Methode pour effectuer un virement d'un compte à compte
	 * 
	 * @param double amount Account account1, Account account2
	 */
	public void DoTransfer(double amount, Account account1, Account account2);

}
