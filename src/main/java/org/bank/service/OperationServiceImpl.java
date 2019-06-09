package org.bank.service;

import org.bank.entity.Account;
import org.bank.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements IOperationService {

	@Autowired
	IAccountRepository iAccountRepo;
	
	@Override
	public void deposit(double amount1, Account account1) {
		iAccountRepo.findById(account1.getIdAccount()).get();
		// if(account1 != null){
		// if (amount1 >0){

		account1.setBalance(account1.getBalance() + amount1);
//		LOGGER.info("Votre nouveau solde est =" + account1.getBalance());
//		LOGGER.info("Depot effectué avec succès");
//	}
//}else {
		// LOGGER.info("Compte inexistant");
	}

	@Override
	public void withdraw(double amount2, Account account2) {
		iAccountRepo.findById(account2.getIdAccount()).get();
		if (account2 != null) {
			if (account2.getBalance() < amount2) {
				account2.setBalance(account2.getBalance() - amount2);
			}
		}
		// LOGGER.info("Retrait impossible, solde insuffisant");
//		LOGGER.info("Votre nouveau solde est =" + account2.getBalance());
//		LOGGER.info("Retrait effectué avec succès");

	}

	@Override
	public void DoTransfer(double amount, Account account1, Account account2) {
		withdraw(amount, account1);
		deposit(amount, account2);
//	 LOGGER.info("Virement effectué avec succès");
//		LOGGER.info("Votre nouveau solde du compte emetteur est =" + account1.getIdAccount());
//		LOGGER.info("Votre nouveau solde du compte recepteur est =" + account2.getIdAccount());
	}
}
