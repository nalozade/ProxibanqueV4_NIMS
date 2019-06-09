package org.bank.service;

import java.util.List;

import org.bank.entity.Account;

public interface IAccountService {

	public void createAccount(Account account);

	public List<Account> getAccountByCustomerId(Long idAccount);

	public List<Account> getListAccount();

	public void deleteAccount(Long idAccount);

	public void updateAccount(Account updatedAccount);

	/**
	 * Methode qui permet de faire l'audit pr les particuliers
	 * 
	 * @paramList<Account> listAcc
	 */
	public boolean AuditParticular(List<Account> listAcc);

	/**
	 * Methode qui permet de faire l'audit pr les entreprises
	 * 
	 * @param List<Account> listAcc
	 */
	public boolean AuditEnterprise(List<Account> listAcc);




	/**
	 * 
	 * @param idClient
	 * 
	 */
	public Account getAccountById(Long idClient);
	
	/**
	 * Generate a Unique Account Nubmber
	 * 
	 * 
	 */
	public String generateAccountNumber(String nom,String prenon);

}
