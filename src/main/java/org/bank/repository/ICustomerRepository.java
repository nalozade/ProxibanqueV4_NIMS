package org.bank.repository;

import java.util.List;

import org.bank.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Long>{

	// public List<Customer> findCostumersByKeyword(String keyWord);
	
}
