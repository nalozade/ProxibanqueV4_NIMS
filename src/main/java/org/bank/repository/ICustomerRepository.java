package org.bank.repository;

import org.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface ICustomerRepository qui herite de JpaRepository et regroupe toutes
 * les methodes CRUD pour le client
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

	// public List<Customer> findCostumersByKeyword(String keyWord);
	
}
