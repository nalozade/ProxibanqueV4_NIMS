package org.bank.restcontroller;

import java.util.List;

import org.bank.entity.Advisor;
import org.bank.service.IAdvisorService;
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
/**
 * Classe RestAdvisorController qui regroupe toutes les methodes CRUD du
 * webservice Rest concernant un conseiller
 * 
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
@RestController
@RequestMapping("/advisors")
public class RestAdvisorController {

	@Autowired
	IAdvisorService iAdvisorServ;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add")
	public Advisor createAdvisor(@RequestBody Advisor advisor) {
		iAdvisorServ.createAdvisor(advisor);
		return advisor;
	}

	@GetMapping("/{id}")
	public Advisor getAdvisor(@PathVariable("id") Long idAdvisor) {

		return iAdvisorServ.getAdvisorById(idAdvisor);
	}

	@GetMapping("/list")
	public List<Advisor> getAllCustomers() {
		return iAdvisorServ.getListAdvisor();
	}

	@PutMapping
	public Advisor updateAdvisor(@RequestBody Advisor updatedAdvisor) {
		iAdvisorServ.updateAdvisor(updatedAdvisor);
		return iAdvisorServ.getAdvisorById(updatedAdvisor.getIdAdvisor());

	}

	@DeleteMapping("/{id}")
	public void deleteAdvisor(@PathVariable("id") Long idAdvisor) {
		iAdvisorServ.deleteAdvisor(idAdvisor);

	}
}
