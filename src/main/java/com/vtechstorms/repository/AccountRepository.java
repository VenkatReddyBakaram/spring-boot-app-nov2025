package com.vtechstorms.repository;

import com.vtechstorms.entities.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {

    public Account findAccountByAccountHolderAndBankName(String accountHolder, String bankName);

    public Account findAccountByAccountHolderOrBankName(String accountHolder, String bankName);

    public List<Account> findAccountByBalanceAvailableLessThan(Double balanceAvailable);

    public List<Account> findAccountByAccountHolderIn(List<String> accountHolderList);


    //spring data JPQL supported query
    @Query("select account from Account account")
    public List<Account> fetchAllAccounts();

    @Query("select account from Account account where account.accountNumber=?1")
    public Account fetchAccountByAccountNumber(Integer accountNumber);

    @Query("select account from Account account where account.accountNumber=?1 and account.accountHolder=?2")
    public Account fetchAccountByAccountNumberAndAccountHolder(Integer accountNumber, String accountHolder);

    @Query("select account from Account account where account.accountHolder=:accountHolder and account.accountNumber=:accountNumber")
    public Account getAccountByAccountNumberAndAccountHolder(@Param("accountNumber") Integer accountNumber, @Param("accountHolder") String accountHolder);


    @Modifying
    @Transactional
    @Query("update Account account set account.accountHolder=:accountHolder where account.accountNumber=:accountNumber")
    public int updateAccount(@Param("accountNumber") Integer accountNumber, @Param("accountHolder") String accountHolder);


    @Modifying
    @Transactional
    @Query("delete Account account")
    public int deleteAccount();

}
