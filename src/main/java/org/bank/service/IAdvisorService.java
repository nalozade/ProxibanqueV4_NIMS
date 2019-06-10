package org.bank.service;

import java.util.List;

import org.bank.entity.Advisor;

/**
 * Interface IAdvisorService regroupant toutes les signatures de méthodes
 * concernant le conseiller
 * 
 * @author Nawal, Imane, Samirath et Maxime
 *
 */
public interface IAdvisorService {

	public void createAdvisor(Advisor advisor);

	public Advisor getAdvisorById(Long idAdvisor);

	public List<Advisor> getListAdvisor();

	public void updateAdvisor(Advisor updatedAdvisor);

	public void deleteAdvisor(Long idAdvisor);

}
