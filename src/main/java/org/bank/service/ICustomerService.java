package org.bank.service;

import java.util.List;

import org.bank.entity.Customer;
/**
 * Interface ICustomerService regroupant toutes les signatures de méthodes
 * concernant le client
 * 
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
public interface ICustomerService {
	
	
	public void createCustomer(Customer customer);

	public Customer getCustomerById(Long id);

	public List<Customer> getList();

	public void deleteCustomer(Long id);

	public void updateCustomer(Customer updatedCustomer);
	
	//public List<Customer> findCustomers(String keyWord);
}
