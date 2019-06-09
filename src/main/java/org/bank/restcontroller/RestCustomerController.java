package org.bank.restcontroller;

import java.util.List;

import org.bank.entity.Customer;
import org.bank.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class RestCustomerController {

	@Autowired
	ICustomerService icustomerserv;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add")
	public Customer createCustomer(@RequestBody Customer customer) {
		icustomerserv.createCustomer(customer);
		return customer;
	}

	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id") Long id) {

		return icustomerserv.getCustomerById(id);
	}

	@GetMapping("/list")
	public List<Customer> getAllCustomers() {
		return icustomerserv.getList();
	}

	@PutMapping
	public Customer updateCustomer(@RequestBody Customer updatedCustomer) {
		icustomerserv.updateCustomer(updatedCustomer);
		return icustomerserv.getCustomerById(updatedCustomer.getId());

	}

	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable("id") Long id) {

		icustomerserv.deleteCustomer(id);
	}
}