package org.bank.repository;

import org.bank.entity.BankingOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBankingOperationRepository extends JpaRepository<BankingOperation, Long>{

}
