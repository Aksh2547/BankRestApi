package com.Spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bank {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="bank_name")
	private String bankName;
	@Column(name="account_number")
	private long accountNumber;
	@Column(name="branch_name")
	private String branchName;
	@Column(name="bank_ifsc")
	private long ifsc;

	public Bank() {
	}

	public Bank(long id, String bankName, long accountNumber, String branchName, long ifsc) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.branchName = branchName;
		this.ifsc = ifsc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getIfsc() {
		return ifsc;
	}

	public void setIfsc(long ifsc) {
		this.ifsc = ifsc;
	}

}
