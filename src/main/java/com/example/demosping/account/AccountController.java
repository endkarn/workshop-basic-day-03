package com.example.demosping.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/v1/account/{id}")
    public String getById(@PathVariable int id) {
        return "Get acccount by id=" + id;
    }

}
