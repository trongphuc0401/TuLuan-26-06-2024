package vn.edu.likelion.Banking.entity;

import java.math.BigDecimal;

/**
 * SavingAccount - model for saving account
 *
 * @param
 * @return
 * @throws
 */
public class SavingAccount extends Banking {


    private  String name;
    private BigDecimal balance;
    private  double interestRate;


    public SavingAccount() {}

    public SavingAccount(String name, BigDecimal balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
