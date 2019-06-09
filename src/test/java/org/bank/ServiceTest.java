package org.bank;

import org.bank.entity.Account;
import org.bank.repository.IBankingOperationRepository;
import org.bank.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class ServiceTest {
@Autowired
IAccountService iacc;

@Autowired
IBankingOperationRepository operRepo;



//	@Test
//	void deposit() {
//		
//		Account ac = accountRepo.findById(6L).get();
//		operRepo.deposit(20.0, ac);
//	
//	}

}
