package org.bank.restcontroller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.bank.entity.Account;
import org.bank.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
@CrossOrigin(origins = "http://localhost:4200")
public class RestAccountController {

	@Autowired
	IAccountService iAccountServ;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Account createAccount(@RequestBody Account account) {
		iAccountServ.createAccount(account);
		return account;
	}

	@GetMapping("/{id}")
	public Account getAccount(@PathVariable("id") Long idAccount) {
		return iAccountServ.getAccountById(idAccount);

	}
	

	@GetMapping
	public List<Account> getAccountsByCustomer(@RequestParam("customerId") Long idAccount) {
		return iAccountServ.getAccountByCustomerId(idAccount);

	}
//
//	@GetMapping
//	public List<Account> getAllAccounts() {
//		return iAccountServ.getListAccount();
//	}

	@PutMapping
	public Account updateAccount(@RequestBody Account updatedAccount) {
		iAccountServ.updateAccount(updatedAccount);
		return iAccountServ.getAccountById(updatedAccount.getIdAccount());

	}

	@DeleteMapping("/{id}")
	public void deleteAccount(@PathVariable("id") Long idAccount) {
		iAccountServ.deleteAccount(idAccount);
	}

}