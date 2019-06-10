package org.bank;

import org.bank.entity.Account;
import org.bank.repository.IAccountRepository;
import org.bank.service.IAccountService;
import org.bank.service.IOperationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ServiceTest {
@Autowired
IAccountService iacc;

@Autowired
IOperationService operServ;
@Autowired
IAccountRepository  accountRepo;


	@Test
	void deposit() {
		
		Account ac = accountRepo.findById(10L).get();
		operServ.deposit(20.0, ac);
	
	}

	@Test
	void withdraw() {
		Account ac1 = accountRepo.findById(10L).get();
		operServ.withdraw(10.0, ac1);
}
	
//	@Test
//	void DoTransfer() {
//		Account ac1 = accountRepo.findById(10L).get();
//		Account ac2 = accountRepo.findById(5L).get();
//		operServ.DoTransfer(50.0, ac1, ac2);
//	}
//	
}