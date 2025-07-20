package com.vtechstorms.dtos;

public class AccountDto {

	private Integer accountNumber;
	private String accountHolder;
	private String bankName;
	private String branch;
	private Double balanceAvailable;

	private AddressDto address;

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

	public Boolean getIsSavingAccount() {
		return isSavingAccount;
	}

	public void setIsSavingAccount(Boolean isSavingAccount) {
		this.isSavingAccount = isSavingAccount;
	}

	private Boolean isSavingAccount;

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getBalanceAvailable() {
		return balanceAvailable;
	}

	public void setBalanceAvailable(Double balanceAvailable) {
		this.balanceAvailable = balanceAvailable;
	}
}
