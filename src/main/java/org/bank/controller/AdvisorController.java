package org.bank.controller;

import java.util.List;

import org.bank.entity.Advisor;
import org.bank.entity.Customer;
import org.bank.repository.IAdvisorRepository;
import org.bank.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdvisorController {

	@Autowired
	ICustomerRepository iCustomerRepo;
	IAdvisorRepository iAdvisorRepo;

	@RequestMapping(value = "/")
	public String hello() {
		return "01_Authentification";
	}

	@RequestMapping(value = "/customerlist", method = RequestMethod.POST)
	public String afficherListeClients(ModelMap modelMap) {

		// Méthode de la couche service à remplacer
		List<Customer> customerList = iCustomerRepo.findAll();
		modelMap.addAttribute("customers", customerList);
		return "02_ListeClients";
	}

	@RequestMapping(value = "/advisorlist", method = RequestMethod.POST)
	public String afficherListeConseillers(ModelMap modelMap ) {
		List<Advisor> advisorList = iAdvisorRepo.findAll();
		modelMap.addAttribute("advisors", advisorList);
		return "03_ListeConseillers.jsp";
	}

	@RequestMapping(value = "/returnauthentification")
	public String returnAuthentification() {
		return "01_Authentification";
	}
}