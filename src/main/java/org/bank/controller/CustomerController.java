package org.bank.controller;

import java.util.List;

import org.bank.entity.Customer;
import org.bank.repository.ICustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerRepository iCustomerRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

	@RequestMapping(value = "/createclient", method = RequestMethod.POST)
	public String register(@ModelAttribute("customer") Customer customer, ModelMap modelMap) {
		LOGGER.info("Inside register()" + customer);
		iCustomerRepository.save(customer);
		List<Customer> listClients = iCustomerRepository.findAll();
		modelMap.addAttribute("customer", listClients);
		return "02_ListeClients";

	}

	// Affichage des informations du client
	@RequestMapping(value = "/showcustomer")
	public String showcustomer(Long id, ModelMap modelMap) {
		Customer customer0 = iCustomerRepository.findById(id).get();
		modelMap.addAttribute("cus", customer0);
//		 Ajout de la liste des comptes du client
//		List<Compte> listeComptes = iCompteService.afficherComptesClient(idClient);
//		for (Compte compte : listeComptes) {
//			LOGGER.info("INFORMATION ID "+compte.getIdCompte()+" Solde "+compte.getSolde());			
//		}
//		modelMap.addAttribute("comptes", listeComptes);
		String banane = "Banane";
		modelMap.addAttribute("bananeInput", banane);
		return "05_AfficherClient";
	}
	
	public String deleteClient(@RequestParam("idCustomer") Long idCustomer, ModelMap modelMap) {
		LOGGER.debug("delete customer" + idCustomer);
		iCustomerRepository.deleteById(idCustomer);
		List<Customer> listClients = iCustomerRepository.findAll();
		modelMap.addAttribute("customer", listClients);
		return "02_ListeClients";

	}
	
	@RequestMapping("/edit")
	public String editCustomer(@RequestParam("idCustomer") Long idCustomer, ModelMap modelMap) {
		LOGGER.debug("edit customer" + idCustomer);
		Customer customer = iCustomerRepository.findById(idCustomer).get();	
		modelMap.addAttribute("customer", customer);
		return "updateCustomer";
		
		
	
	


//	// une fois le client validéee, l'afficher, le mettre à jour avec ses nouvelles
//	// valeurs dans la liste
//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public String update(@ModelAttribute("client") Client client, ModelMap modelMap) {
//		LOGGER.debug("update client" + client);
//
//		clientRepository.save(client);// valider les modifications
//		List<Client> allclients = clientRepository.findAll();
//		modelMap.addAttribute("client", allclients);
//		return "clientList";

	}

}
