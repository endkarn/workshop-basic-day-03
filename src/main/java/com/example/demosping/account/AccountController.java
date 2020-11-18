package com.example.demosping.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/v1/account/{id}")
    public AccountResponse getById(@PathVariable int id) {
        Optional<Account> account =  accountRepository.findById(id);
        if(account.isPresent()) {
            AccountResponse accountResponse = new AccountResponse();
            accountResponse.setId(account.get().getAccountId());
            accountResponse.setName(account.get().getAccountName());
            accountResponse.setAge(account.get().getAge());
            return accountResponse;
        }
        throw new RuntimeException("Account not found with id="+ id);
    }

}
