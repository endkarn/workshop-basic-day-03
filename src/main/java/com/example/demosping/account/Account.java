package com.example.demosping.account;

import javax.persistence.*;

@Entity
public class Account {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer accountId;
    private String accountName;
    private Integer age;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
