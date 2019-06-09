package org.bank.repository;

import org.bank.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICardRepository extends JpaRepository<CreditCard, Long>{

}
