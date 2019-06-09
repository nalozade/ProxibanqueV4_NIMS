package org.bank.repository;

import java.util.List;

import org.bank.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Long>{

	List<Account> findByCustomerId(Long idClient);

}

