package vn.edu.likelion.Banking.entity;

import java.math.BigDecimal;

/**
 * CurrentAccount - model for Current Account
 *
 * @param
 * @return
 * @throws
 */
public class CurrentAccount extends Banking{

    private  String name;
    private BigDecimal balance;
    private  BigDecimal overdraftLimit;


    public CurrentAccount() {}


    public CurrentAccount(String name, BigDecimal balance, BigDecimal overdraftLimit) {
        this.name = name;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
