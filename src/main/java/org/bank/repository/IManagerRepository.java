package org.bank.repository;

import org.bank.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IManagerRepository extends JpaRepository<Manager, Long> {

}
