package com.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.model.Bank;
import com.Spring.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankService;
	
	@GetMapping("/bank")
	public List<Bank> getBank(){
		return bankService.getBank();
	}	
	@PostMapping("/bank/add")
	public String addBank(@RequestBody Bank bank) {
		bankService.addBank(bank);
		return "Bank Added Successfuly !!";
	}
	
	@PutMapping("/bank/update")
	public String updateBank(@RequestBody Bank bank) {
		bankService.updateBank(bank);
		return "Bank Updated Successfully!!!";
	}
	@DeleteMapping("/bank/delete/{id}")
	public String deleteBankById(@PathVariable("id") long id) {
		bankService.deleteBank(id);
		return "Bank deleted Successfully!!";
	}
	
}
