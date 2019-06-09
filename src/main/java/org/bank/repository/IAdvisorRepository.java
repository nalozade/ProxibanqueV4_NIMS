package org.bank.repository;

import org.bank.entity.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdvisorRepository extends JpaRepository<Advisor, Long>{

}
