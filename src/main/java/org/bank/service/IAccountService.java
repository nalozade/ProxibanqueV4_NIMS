package org.bank.service;

import java.util.List;

import org.bank.entity.Account;

/**
 * Interface IAccountService regroupant toutes les signatures de méthodes
 * concernant le compte
 * 
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
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
	 * Methode qui permet de trouver un compte
	 * 
	 * @param idClient
	 * 
	 */
	public Account getAccountById(Long idClient);

	/**
	 * methode qui permet de generer un numero de compte unique
	 * 
	 * @param nom, prenom
	 */
	public String generateAccountNumber(String nom, String prenon);

}
