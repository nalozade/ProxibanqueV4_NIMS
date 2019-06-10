package org.bank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.bank.entity.Account;
import org.bank.entity.Customer;
import org.bank.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerRepository iCustomerRepo;
	
	@Autowired
	IAccountService accountService;
	/**
	 * Methode qui permet de creer un client et de lui associer un compte 
	 * dont	le numero de compte est UNIQUE et généré automatiquement en appelant la methode generateAccountNumber()
	 * du service Account
	 * @author NIMS
	 *
	 */
	@Override
	public void createCustomer(Customer customer) {
		if (customer != null) {
			Account account  = new Account();
			account.setCreationDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
			account.setAccountNumber(this.accountService.generateAccountNumber(customer.getFirstname(), customer.getLastname()));
			account.setCustomer(customer);
			
//			Account account1  = new Account();
//			account1.setCreationDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
//			account1.setAccountNumber(this.accountService.generateAccountNumber(customer.getFirstname(), customer.getLastname()));
//			account1.setCustomer(customer);
			
			customer.getAccountList().add(account);
//			customer.getAccountList().add(account1);
			iCustomerRepo.save(customer);
			
		

		}

	}

	@Override
	public Customer getCustomerById(Long id) {

		return iCustomerRepo.findById(id).get();

	}

	@Override
	public List<Customer> getList() {

		return iCustomerRepo.findAll();
	}

	@Override
	public void updateCustomer(Customer updatedCustomer) {
		Customer c1 = iCustomerRepo.findById(updatedCustomer.getId()).get();
		c1.setFirstname(updatedCustomer.getFirstname());
		c1.setLastname(updatedCustomer.getLastname());
		c1.setAddress(updatedCustomer.getAddress());
		c1.setPostalCode(updatedCustomer.getPostalCode());
		c1.setCity(updatedCustomer.getCity());
		c1.setTelephone(updatedCustomer.getTelephone());
		c1.setEmail(updatedCustomer.getEmail());
		iCustomerRepo.save(c1);

	}

	@Override
	public void deleteCustomer(Long id) {
		iCustomerRepo.deleteById(id);

	}

//	@Override
//	public List<Customer> findCustomers(String keyword) {
//		return iCustomerRepo.findCostumersByKeyword(keyword);
//	}
}