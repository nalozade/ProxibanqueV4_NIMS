package org.bank.restcontroller;

import java.util.List;

import org.bank.entity.BankingOperation;
import org.bank.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe RestOperationController qui regroupe toutes les methodes GET et POST
 * du webservice Rest concernant une operation bancaire
 * 
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
@RestController
@RequestMapping("/operations")
public class RestOperationController {

	@Autowired
	IOperationService iopserv;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public BankingOperation createOperation(@RequestBody BankingOperation operation) {
		iopserv.createOperation(operation);
		return operation;
	}

	@GetMapping("/{id}")
	public BankingOperation getOperation(@PathVariable("id") Long id) {

		return iopserv.getOperationById(id);
	}

	@GetMapping
	public List<BankingOperation> getAllOperations() {
		return iopserv.getList();
	}

}
