package com.vtechstorms.service.impl;

import com.vtechstorms.dtos.AccountDto;
import com.vtechstorms.dtos.AddressDto;
import com.vtechstorms.entities.Account;
import com.vtechstorms.repository.AccountRepository;
import com.vtechstorms.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountDto getAccountDetails() {

        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNumber(12345);
        accountDto.setAccountHolder("John");
        accountDto.setBankName("SBI");
        accountDto.setBranch("Hyd");
        accountDto.setBalanceAvailable(600000.50);
        accountDto.setIsSavingAccount(true);

        AddressDto addressDto = new AddressDto();

        addressDto.setStreet("123 Main St");
        addressDto.setCity("Springfield");
        addressDto.setState("Illinois");
        addressDto.setPostalCode("62704");
        addressDto.setCountry("USA");
        addressDto.setApartmentNumber("Apt 4B");

        accountDto.setAddress(addressDto);

        return accountDto;
    }

    public AccountDto postAccountDetails(AccountDto accountDto) {

        accountDto.setAccountHolder(accountDto.getAccountHolder() + " Smith");
        accountDto.setBalanceAvailable(accountDto.getBalanceAvailable() + 400000.50);

        String updatedCountry = null;

        if (accountDto.getAddress().getCountry().equals("USA"))
            updatedCountry = "United States of America";
        else
            updatedCountry = accountDto.getAddress().getCountry();

        accountDto.getAddress().setCountry(updatedCountry);

        return accountDto;

    }

    public Account saveAccountDetails(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> saveAllAccountDetails(List<Account> listOfAccount) {
        return (List<Account>) accountRepository.saveAll(listOfAccount);
    }

    public List<Account> fetchAccountDetails() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public Optional<Account> getAccountByAccountNumber(Integer accountNumber) {
        return accountRepository.findById(accountNumber);
    }

    @Override
    public String deleteAccounts() {
        accountRepository.deleteAll();
        return "Successfully Deleted";
    }

    @Override
    public String deleteAccountsByAccountNumber(Integer accountNumber) {
        accountRepository.deleteById(accountNumber);
        return "Successfully Deleted account details with the account number :" + accountNumber;
    }

    @Override
    public Account updateAccountDetails(Account account) {

        Account dbAccount = null;
        try {
            dbAccount = accountRepository.findById(account.getAccountNumber()).get();
            dbAccount.setAccountHolder(account.getAccountHolder());
            dbAccount.setBranch(account.getBranch());
            dbAccount.setBankName(account.getBankName());
            dbAccount.setBalanceAvailable(account.getBalanceAvailable());
        } catch (NoSuchElementException exception) {
            throw new RuntimeException("You are trying to update the Account with invalid account Number :" + account.getAccountNumber(), exception);
        }

        return accountRepository.save(dbAccount);

    }

    @Override
    public Account findAccountByAccountHolderAndBankName(String accountHolder, String bankName) {
        return accountRepository.findAccountByAccountHolderAndBankName(accountHolder, bankName);
    }

    @Override
    public Account findAccountByAccountHolderOrBankName(String accountHolder, String bankName) {
        return accountRepository.findAccountByAccountHolderOrBankName(accountHolder, bankName);
    }

    @Override
    public List<Account> findAccountByBalanceAvailableLessThan(Double balanceAvailable) {
        return accountRepository.findAccountByBalanceAvailableLessThan(balanceAvailable);
    }

    @Override
    public List<Account> findAccountByAccountHolderIn(List<String> accountHolderList) {
        return accountRepository.findAccountByAccountHolderIn(accountHolderList);
    }

    @Override
    public List<Account> fetchAllAccounts() {
        return accountRepository.fetchAllAccounts();
    }

    @Override
    public Account fetchAccountByAccountNumber(Integer accountNumber) {
        return accountRepository.fetchAccountByAccountNumber(accountNumber);
    }

    @Override
    public Account fetchAccountByAccountNumberAndAccountHolder(Integer accountNumber, String accountHolder) {
        return accountRepository.fetchAccountByAccountNumberAndAccountHolder(accountNumber, accountHolder);
    }

    @Override
    public Account getAccountByAccountNumberAndAccountHolder(Integer accountNumber, String accountHolder) {
        return accountRepository.getAccountByAccountNumberAndAccountHolder(accountNumber, accountHolder);
    }

    @Override
    public int updateAccount(Integer accountNumber, String accountHolder){
        return accountRepository.updateAccount(accountNumber,accountHolder);
    }

    @Override
    public int deleteAccount() {
        return accountRepository.deleteAccount();
    }

}
