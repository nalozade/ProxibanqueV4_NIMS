package org.bank.repository;

import org.bank.entity.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface IAdvisorRepository qui herite de JpaRepository et regroupe toutes
 * les methodes CRUD pour le conseiller
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
public interface IAdvisorRepository extends JpaRepository<Advisor, Long> {

}
