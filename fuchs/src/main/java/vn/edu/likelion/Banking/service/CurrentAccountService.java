package vn.edu.likelion.Banking.service;

import vn.edu.likelion.Banking.entity.CurrentAccount;
import vn.edu.likelion.Banking.repository.Account;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * CurrentAccountService -
 *
 * @param
 * @return
 * @throws
 */
public class CurrentAccountService implements Account {
    static List<CurrentAccount> currentAccountServiceList = new LinkedList<>();
    CurrentAccount currentAccount = new CurrentAccount();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void deposit( BigDecimal amount) {
        BigDecimal result = currentAccount.getBalance().add(amount);
            System.out.println("Now deposit $"+ amount +" to Current Account.");
            currentAccount.setBalance(result);
    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void calculateInterestRate() {

    }

    @Override
    public BigDecimal getBalance() {
        return currentAccount.getBalance();
    }

    @Override
    public void addAccount() {

        inputIntialDeposit(currentAccount);
        inputOverdraftLimit(currentAccount);
        currentAccountServiceList.add(currentAccount);
    }
    public void displayAccount() {
        System.out.println("Current Account");
        System.out.println("Initial Deposit:  $"+currentAccount.getBalance());
        System.out.println("OverdraftLimit: $"+currentAccount.getOverdraftLimit());
    }

    public static BigDecimal inputIntialDeposit(CurrentAccount currentAccount) {
        while (true) {
            try {
                System.out.println("Please enter Initial Deposit your account");
                BigDecimal amount = scanner.nextBigDecimal();
                currentAccount.setBalance(amount);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Not number. Please try again");
                scanner.nextLine();
            }
        }
        return currentAccount.getBalance();
    }

    public static BigDecimal inputOverdraftLimit(CurrentAccount currentAccount) {
        while (true) {
            try {
                System.out.println("Please enter Overdraft Limit this account account");
                BigDecimal overdraftLimit = scanner.nextBigDecimal();
                currentAccount.setOverdraftLimit(overdraftLimit);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Not number. Please try again");
                scanner.nextLine();
            }
        }
        return currentAccount.getOverdraftLimit();
    }

    public static BigDecimal inputDeposit(CurrentAccount currentAccount) {
        while (true) {
            try {
                System.out.println("Please enter Deposit this account account");
                BigDecimal deposit = scanner.nextBigDecimal();
                currentAccount.setOverdraftLimit(deposit);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Not number. Please try again");
                scanner.nextLine();
            }
        }
        return currentAccount.getOverdraftLimit();
    }
}
