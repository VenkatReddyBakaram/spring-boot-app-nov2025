package com.vtechstorms.service;

import com.vtechstorms.dtos.AccountDto;
import com.vtechstorms.entities.Account;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    public AccountDto getAccountDetails();

    public AccountDto postAccountDetails(AccountDto accountDto);

    public Account saveAccountDetails(Account account);

    public List<Account> saveAllAccountDetails(List<Account> listOfAccount);

    public List<Account> fetchAccountDetails();

    public Optional<Account> getAccountByAccountNumber(Integer accountNumber);

    public String deleteAccounts();

    public String deleteAccountsByAccountNumber(Integer accountNumber);

    public Account updateAccountDetails(Account account);


    public Account findAccountByAccountHolderAndBankName(String accountHolder, String bankName);

    public Account findAccountByAccountHolderOrBankName(String accountHolder, String bankName);

    public List<Account> findAccountByBalanceAvailableLessThan(Double balanceAvailable);

    public List<Account> findAccountByAccountHolderIn(List<String> accountHolderList);


    public List<Account> fetchAllAccounts();

    public Account fetchAccountByAccountNumber(Integer accountNumber);

    public Account fetchAccountByAccountNumberAndAccountHolder(Integer accountNumber, String accountHolder);

    public Account getAccountByAccountNumberAndAccountHolder(Integer accountNumber, String accountHolder);

    public int updateAccount(Integer accountNumber, String accountHolder);

    public int deleteAccount();

}
