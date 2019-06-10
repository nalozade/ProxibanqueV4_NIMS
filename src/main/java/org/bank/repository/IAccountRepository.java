package org.bank.repository;

import java.util.List;

import org.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface IAccountRepository qui herite de JpaRepository et regroupe toutes les 
 * methodes CRUD pour le compte
 * @author Nawal, Imane, Samirath et Maxime
 */
public interface IAccountRepository extends JpaRepository<Account, Long>{

	List<Account> findByCustomerId(Long idClient);

}

