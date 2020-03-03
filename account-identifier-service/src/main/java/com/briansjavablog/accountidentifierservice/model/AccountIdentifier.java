
package com.briansjavablog.accountidentifierservice.model;


public class AccountIdentifier {

	private String accountNumber;
	
	private String accountIdentifierServicePort;

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @param accountIdentifierServicePort the accountIdentifierServicePort to set
	 */
	public void setAccountIdentifierServicePort(String accountIdentifierServicePort) {
		this.accountIdentifierServicePort = accountIdentifierServicePort;
	}

	/**
	 * @return the accountIdentifierServicePort
	 */
	public String getAccountIdentifierServicePort() {
		return accountIdentifierServicePort;
	}
}
