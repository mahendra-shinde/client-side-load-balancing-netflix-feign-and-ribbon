package com.briansjavablog.microservices.bankaccount.model;

public class AccountIdentifier {

	private String accountNumber;
	private String accountIdentifierServicePort;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountIdentifierServicePort() {
		return accountIdentifierServicePort;
	}

	public void setAccountIdentifierServicePort(String accountIdentifierServicePort) {
		this.accountIdentifierServicePort = accountIdentifierServicePort;
	}

	public AccountIdentifier(String accountNumber, String accountIdentifierServicePort) {
		this.accountNumber = accountNumber;
		this.accountIdentifierServicePort = accountIdentifierServicePort;
	}

	public AccountIdentifier() {
	}

	
}
