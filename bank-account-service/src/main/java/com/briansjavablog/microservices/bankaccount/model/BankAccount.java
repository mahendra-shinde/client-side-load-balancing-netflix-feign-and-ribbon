package com.briansjavablog.microservices.bankaccount.model;

import java.math.BigDecimal;


public class BankAccount {

	
	private String accountName;

	private EnumAccountType accountType;

	private BigDecimal accountBlance;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public EnumAccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(EnumAccountType accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getAccountBlance() {
		return accountBlance;
	}

	public void setAccountBlance(BigDecimal accountBlance) {
		this.accountBlance = accountBlance;
	}

	public BankAccount(String accountName, EnumAccountType accountType, BigDecimal accountBlance) {
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBlance = accountBlance;
	}

	public BankAccount() {
	}

	@Override
	public String toString() {
		return "BankAccount [accountBlance=" + accountBlance + ", accountName=" + accountName + ", accountType="
				+ accountType + "]";
	}
}
