package com.Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
