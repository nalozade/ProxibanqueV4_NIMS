package org.bank.repository;

import org.bank.entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface ICardRepository qui herite de JpaRepository et regroupe toutes
 * les methodes CRUD pour la carte bancaire
 * 
 * @author Nawal, Imane, Samirath et Maxime
 */
public interface ICardRepository extends JpaRepository<CreditCard, Long>{

}
