package org.bank.service;

import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.BankingOperation;

/**
 * Interface IOperationService regroupant toutes les signatures de méthodes
 * concernant les operations bancaires
 * 
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
public interface IOperationService {

	public void createOperation(BankingOperation operation);

	public BankingOperation getOperationById(Long id);

	public List<BankingOperation> getList();

	/**
	 * Methode qui permet d'effectuer un depot
	 * 
	 * @param double amount, Account account
	 */
	public void deposit(double amount, Account account);

	/**
	 * Methode qui permet d'effectuer un retrait
	 * 
	 * @param double m, Account account
	 */
	public void withdraw(double amount, Account account);

	/**
	 * Methode pour effectuer un virement d'un compte à compte
	 * 
	 * @param double amount, Account account1, Account account2
	 */
	public void DoTransfer(double amount, Account account1, Account account2);

}
