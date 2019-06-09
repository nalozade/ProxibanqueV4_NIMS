package org.bank;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bank.entity.Account;
import org.bank.entity.Advisor;
import org.bank.entity.BankingOperation;
import org.bank.entity.CreditCard;
import org.bank.entity.CurrentAccount;
import org.bank.entity.Customer;
import org.bank.entity.Debit;
import org.bank.entity.Enterprise;
import org.bank.entity.Manager;
import org.bank.entity.Particular;
import org.bank.entity.SavingsAccount;
import org.bank.repository.IAdvisorRepository;
import org.bank.repository.ICustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxibanqueV4NimsApplicationTests {

	@Autowired
	ICustomerRepository iCustomerRepo;

	@Autowired
	IAdvisorRepository iAdvisorRepo;

//	@Autowired
//	IAccountRepository iAccountRepo;
//	
//	@Autowired
//	IBankingOperationRepository iBankingRepo;
//	
//	@Autowired
//	ICardRepository iCardRepo;
//	
//	@Autowired
//	IManagerRepository iManagerRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createCustomer() {

		Set<Customer> listCus = new HashSet<Customer>();
		Customer client4 = new Particular("Ali", "MENARD", "7,rue clef des champs", "93400", "St-Ouen", "0685741585",
				"lali@gmail.com");
		Customer client6 = new Enterprise("DECO SARL", null, "125 bd st michel", "75005", "Paris", "0785414587",
				"deco@deco.com");
	Customer client5 = new Particular("Simo", "NOUHI", "8, rue rivoli", "75001",
	"Paris", "065512234",
		"sn@gmail.com");
	listCus.add(client5);
		listCus.add(client4);
		listCus.add(client6);

		List<Advisor> listAdv = new ArrayList<>();
		Advisor advisor1 = new Advisor("IMANE", "BENAISSA", "test", "test");
Advisor advisor2 = new Advisor("Nawal", "Alozade", "test2", "test2");
client4.setAdvisor(advisor1);
client5.setAdvisor(advisor1);
//				listAdv.add(advisor1);
//		listAdv.add(advisor2);
	advisor1.setSetCustomer(listCus);

		client4.setAdvisor(advisor1);
		client6.setAdvisor(advisor2);
//		
//	
//
		 Manager manager1 = new Manager("Dupont", "Loic", "admin1", "admin1");
		advisor1.setManager(manager1);// on associe un conseiller à un manager
	advisor2.setManager(manager1);
		 manager1.setListAdvisor(listAdv);
//        
//        
//        
List<Account> listAccount1 = new ArrayList<>();
List<Account> listAccount2 = new ArrayList<>();
 Account account1= new CurrentAccount("12G58", 1542, "02/04/2014");
 Account account2=new CurrentAccount("15Y54", 500000, "01/05/2016");
Account account3= new SavingsAccount("52P55", 60522, "05/06/2016");
   listAccount1.add(account1);
  listAccount1.add(account2);
listAccount2.add(account3);
//	    
	account1.setCustomer(client4);
account2.setCustomer(client5);
account3.setCustomer(client6);
        client4.setAccountList(listAccount1);
client6.setAccountList(listAccount2);
client5.setAccountList(listAccount1);
//		
	CreditCard cb1 =new CreditCard("Visa Electron");	
//	CreditCard cb2 =new CreditCard("Visa Premier");
CreditCard cb3 =new CreditCard("Visa Premier");
//



//cb1.setAccount(account1);
////	cb2.setAccount(account2);
//cb3.setAccount(account3);
//account1.setCreditCard(cb1);
////	account2.setCreditCard(cb2);
//account3.setCreditCard(cb3);
////	



	List<BankingOperation> listop1 = new ArrayList<>();
BankingOperation op1 = new Debit(120, "02/05/2019");
//		BankingOperation op2 = new Credit(1000, "01/05/2019");
List<BankingOperation> listop2 = new ArrayList<>();
BankingOperation op3 = new Debit(40, "14/06/2019");
//		//BankingOperation op4 = new Credit(500, "12/05/2019");
//		
listop1.add(op1);
//		listop1.add(op2);
listop2.add(op3);
//		//listop2.add(op4);
//		
op1.setAccount(account1);
//		op2.setAccount(account1);
//op3.setAccount(account3);
	account1.setListOp(listop1);
//		account3.setListOp(listop2);




	iCustomerRepo.save(client5);


		iCustomerRepo.save(client4);
iCustomerRepo.save(client6);
	}
}
