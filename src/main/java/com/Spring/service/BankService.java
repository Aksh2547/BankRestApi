package com.Spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.model.Bank;
import com.Spring.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankRepository;

	public List<Bank> getBank() {
		List<Bank> banklist = new ArrayList<Bank>();
		bankRepository.findAll().forEach(list -> banklist.add(list));
		return banklist;
	}

	public void addBank(Bank bank) {
		bankRepository.save(bank);
	}

	public void updateBank(Bank bank) {
		bankRepository.save(bank);
	}

	public void deleteBank(long id) {
		bankRepository.deleteById(id);
	}

}
