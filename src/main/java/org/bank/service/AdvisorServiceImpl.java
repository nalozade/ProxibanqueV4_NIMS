package org.bank.service;

import java.util.List;

import org.bank.entity.Advisor;
import org.bank.repository.IAdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdvisorServiceImpl implements IAdvisorService {

	@Autowired
	IAdvisorRepository iAdvisorRepo;

	@Override
	public void createAdvisor(Advisor advisor) {
		if (advisor != null) {
			iAdvisorRepo.save(advisor);
		}

	}

	@Override
	public Advisor getAdvisorById(Long idAdvisor) {
		return iAdvisorRepo.findById(idAdvisor).get();
	}

	@Override
	public List<Advisor> getListAdvisor() {
		return iAdvisorRepo.findAll();
	}

	@Override
	public void updateAdvisor(Advisor updatedAdvisor) {
		Advisor advisor = iAdvisorRepo.findById(updatedAdvisor.getIdAdvisor()).get();
		advisor.setLastName(updatedAdvisor.getLastName());
		advisor.setFisrtName(updatedAdvisor.getFisrtName());
		advisor.setPassword(updatedAdvisor.getPassword());
		advisor.setLogin(updatedAdvisor.getLogin());
		iAdvisorRepo.save(advisor);
	}

	@Override
	public void deleteAdvisor(Long idAdvisor) {
		iAdvisorRepo.deleteById(idAdvisor);
	}

}
