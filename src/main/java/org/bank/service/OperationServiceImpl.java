package org.bank.service;

import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.BankingOperation;
import org.bank.repository.IAccountRepository;
import org.bank.repository.IBankingOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe qui implémente l'interface IOperationService qui permet de faire le
 * lien entre la BD et les signatures de methodes de l'interface de la couche
 * service
 *
 *
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
@Service
public class OperationServiceImpl implements IOperationService {
	private static final Logger LOGGER = LoggerFactory.getLogger(OperationServiceImpl.class);
	@Autowired
	IAccountRepository iAccountRepo;

	@Autowired
	IBankingOperationRepository iBankOperation;

	@Override
	public void deposit(double amount1, Account account1) {
		iAccountRepo.findById(account1.getIdAccount()).get();
		if (account1 != null) {
			if (amount1 > 0) {

				account1.setBalance(account1.getBalance() + amount1);
				LOGGER.info("Votre nouveau solde est =" + account1.getBalance());
				LOGGER.info("Depot effectué avec succès");
			}
		} else {
			LOGGER.info("Compte inexistant");
		}
	}

	@Override
	public void withdraw(double amount2, Account account2) {
		iAccountRepo.findById(account2.getIdAccount()).get();
		if (account2 != null) {
			if (account2.getBalance() < amount2) {
				account2.setBalance(account2.getBalance() - amount2);
			}
		}
		LOGGER.info("Retrait impossible, solde insuffisant");
		LOGGER.info("Votre nouveau solde est =" + account2.getBalance());
		LOGGER.info("Retrait effectué avec succès");

	}

	@Override
	public void DoTransfer(double amount, Account account1, Account account2) {
		withdraw(amount, account1);
		deposit(amount, account2);
		LOGGER.info("Virement effectué avec succès");
		LOGGER.info("Votre nouveau solde du compte emetteur est =" + account1.getIdAccount());
		LOGGER.info("Votre nouveau solde du compte recepteur est =" + account2.getIdAccount());
	}

	@Override
	public void createOperation(BankingOperation operation) {
		if (operation != null) {
			iBankOperation.save(operation);
		}

	}

	@Override
	public BankingOperation getOperationById(Long id) {

		return iBankOperation.findById(id).get();
	}

	@Override
	public List<BankingOperation> getList() {

		return iBankOperation.findAll();
	}

}
