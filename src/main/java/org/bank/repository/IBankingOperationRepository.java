package org.bank.repository;

import org.bank.entity.BankingOperation;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface IBankingOperationRepository qui herite de JpaRepository et regroupe toutes
 * les methodes CRUD pour le conseiller
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
public interface IBankingOperationRepository extends JpaRepository<BankingOperation, Long>{

}
