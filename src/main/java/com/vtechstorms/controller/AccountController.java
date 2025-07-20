package com.vtechstorms.controller;

import com.vtechstorms.dtos.AccountDto;
import com.vtechstorms.dtos.AccountUpdateDto;
import com.vtechstorms.entities.Account;
import com.vtechstorms.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@Controller
@RestController
@RequestMapping("/account")
public class AccountController {

    // @RequestMapping(value = "/getAccountDetails", method = RequestMethod.GET)
    // @ResponseBody

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getAccountDetails")
    public AccountDto getAccountDetails() {
        AccountDto accountDto = accountService.getAccountDetails();
        return accountDto;
    }

    @PostMapping("/postAccountDetails")
    public AccountDto postAccountDetails(@RequestBody AccountDto accountDto) {
        return accountService.postAccountDetails(accountDto);
    }

    @DeleteMapping("/deleteAccountDetails")
    public String deleteAccountDetails() {
        return "account details deleted";
    }

    @PutMapping("/updateAccountDetails")
    public String updateAccountDetails() {
        return "account details are updated";
    }

    @PatchMapping("/updatePartialAccountDetails")
    public String updatePartialAccountDetails() {
        return "account details are partially updated";
    }

    @PostMapping("/saveAccountDetails")
    public Account saveAccountDetails(@RequestBody Account account) {
        return accountService.saveAccountDetails(account);
    }

    @PostMapping("/saveAllAccountDetails")
    public List<Account> saveAllAccountDetails(@RequestBody List<Account> listOfAccount) {
        return accountService.saveAllAccountDetails(listOfAccount);
    }

    @GetMapping("/fetchAccountDetails")
    public List<Account> fetchAccountDetails() {
        return accountService.fetchAccountDetails();
    }

    @GetMapping("/getAccountByAccountNumber")
    public Optional<Account> getAccountByAccountNumber(@RequestParam("accountNumber") Integer accountNumber) {
        return accountService.getAccountByAccountNumber(accountNumber);
    }

    @DeleteMapping("/deleteAccounts")
    public String deleteAccounts() {
        return accountService.deleteAccounts();
    }

    @DeleteMapping("/deleteAccountsByAccountNumber")
    public String deleteAccountsByAccountNumber(@RequestParam("accountNumber") Integer accountNumber) {
        return accountService.deleteAccountsByAccountNumber(accountNumber);
    }

    @PutMapping("/updateAccountInfo")
    public Account updateAccountInfo(@RequestBody Account account) {
        Account dbAccount = accountService.updateAccountDetails(account);
        return dbAccount;
    }

    @GetMapping("/findAccountByAccountHolderAndBankName")
    public Account findAccountByAccountHolderAndBankName(@RequestParam("accountHolder") String accountHolder,
                                                         @RequestParam("bankName") String bankName) {
        return accountService.findAccountByAccountHolderAndBankName(accountHolder, bankName);
    }

    @GetMapping("/findAccountByAccountHolderOrBankName")
    public Account findAccountByAccountHolderOrBankName(@RequestParam("accountHolder") String accountHolder,
                                                        @RequestParam("bankName") String bankName) {
        return accountService.findAccountByAccountHolderOrBankName(accountHolder, bankName);
    }

    @GetMapping("/findAccountByBalanceAvailableLessThan")
    public List<Account> findAccountByBalanceAvailableLessThan(@RequestParam("balanceAvailable") Double balanceAvailable) {
        return accountService.findAccountByBalanceAvailableLessThan(balanceAvailable);
    }

    @GetMapping("/findAccountByAccountHolderIn")
    public List<Account> findAccountByAccountHolderIn(@RequestParam("accountHolderList") List<String> accountHolderList) {
        return accountService.findAccountByAccountHolderIn(accountHolderList);
    }

    @GetMapping("/fetchAllAccounts")
    public List<Account> fetchAllAccounts() {
        return accountService.fetchAllAccounts();
    }

    @GetMapping("/fetchAccountByAccountNumber/{accountNumber}")
    public Account fetchAccountByAccountNumber(@PathVariable Integer accountNumber) {
        return accountService.fetchAccountByAccountNumber(accountNumber);
    }

    @GetMapping("/fetchAccountByAccountNumberAndAccountHolder/{accountNumber}/{accountHolder}")
    public Account fetchAccountByAccountNumberAndAccountHolder(@PathVariable Integer accountNumber, @PathVariable String accountHolder) {
        return accountService.fetchAccountByAccountNumberAndAccountHolder(accountNumber, accountHolder);
    }

    @GetMapping("/getAccountByAccountNumberAndAccountHolder/{accountNumber}/{accountHolder}")
    public Account getAccountByAccountNumberAndAccountHolder(@PathVariable Integer accountNumber, @PathVariable String accountHolder) {
        return accountService.getAccountByAccountNumberAndAccountHolder(accountNumber, accountHolder);
    }

    @PatchMapping("/updateAccountByAccountNumber")
    public String updateAccountByAccountNumber(@RequestBody AccountUpdateDto account) {

        Integer accountNumber = account.getAccountNumber();
        String accountHolder = account.getAccountHolder();

        int rows = accountService.updateAccount(accountNumber, accountHolder);
        return "row(" + rows + ")s are affected";
    }

    @DeleteMapping("/deleteAccount")
    public String deleteAccount() {
        int rows = accountService.deleteAccount();
        return "row(" + rows + ")s are affected";
    }
}
