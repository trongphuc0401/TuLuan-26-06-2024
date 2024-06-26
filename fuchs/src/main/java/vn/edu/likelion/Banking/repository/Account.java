package vn.edu.likelion.Banking.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/**
 * BankingRepository - interface for banking
 *
 * @param
 * @return
 * @throws
 */
public interface Account {
     void deposit(BigDecimal amount);
     void withdraw(BigDecimal amount);
     void calculateInterestRate();
     BigDecimal getBalance();
     void addAccount();

}
