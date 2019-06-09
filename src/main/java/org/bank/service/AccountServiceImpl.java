package org.bank.service;

import java.util.Date;
import java.util.List;

import org.bank.entity.Account;
import org.bank.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	IAccountRepository iAccountRepo;

	@Override
	public void createAccount(Account account) {
		if (account != null)
			iAccountRepo.save(account);

	}

	@Override
	public List<Account> getAccountByCustomerId(Long idClient) {
		return iAccountRepo.findByCustomerId(idClient);
	}

	@Override
	public Account getAccountById(Long idClient) {
		return iAccountRepo.findById(idClient).get();
	}

	@Override
	public List<Account> getListAccount() {
		return iAccountRepo.findAll();
	}

	@Override
	public void deleteAccount(Long idAccount) {
		iAccountRepo.deleteById(idAccount);

	}

	@Override
	public void updateAccount(Account updatedAccount) {
		Account account = iAccountRepo.findById(updatedAccount.getIdAccount()).get();

		account.setAccountNumber(updatedAccount.getAccountNumber());
		account.setBalance(updatedAccount.getBalance());
		account.setCreationDate(updatedAccount.getCreationDate());
		iAccountRepo.save(account);
	}

	@Override
	public boolean AuditParticular(List<Account> listAcc) {

		return false;
	}

	@Override
	public boolean AuditEnterprise(List<Account> listAcc) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public String generateAccountNumber(String nom, String prenom) {
		String accountNumber = nom + prenom + new Date().toString();
		return String.valueOf(accountNumber.hashCode());

	}

}
