package vn.edu.likelion.Banking.service;

import vn.edu.likelion.Banking.entity.CurrentAccount;
import vn.edu.likelion.Banking.entity.SavingAccount;
import vn.edu.likelion.Banking.repository.Account;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * SavingAccountService -
 *
 * @param
 * @return
 * @throws
 */
public class SavingAccountService implements Account {
    static List<SavingAccount> savingAccountLinkedList = new LinkedList<>();
    SavingAccount savingAccount = new SavingAccount();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void deposit( BigDecimal amount) {
        BigDecimal result =savingAccount.getBalance().add(amount);
        System.out.println("Now deposit $"+ amount +" to Savings Account.");
        savingAccount.setBalance(result);

    }

    @Override
    public void withdraw(BigDecimal amount) {

        BigDecimal result = savingAccount.getBalance().subtract(amount);
        System.out.println("Withdraw $"+amount+" from Savings Account.\n");
        savingAccount.setBalance(result);
    }

    @Override
    public void calculateInterestRate() {
        BigDecimal result1 = savingAccount.getBalance();
        BigDecimal temp = BigDecimal.valueOf(savingAccount.getInterestRate()/100);
        BigDecimal result =  savingAccount.getBalance().multiply(temp);
        savingAccount.setBalance(result.add(result1));
    }

    @Override
    public BigDecimal getBalance() {
        return savingAccount.getBalance();
    }

    @Override
    public void addAccount() {

        inputIntialDeposit(savingAccount);
        inputInterestRate(savingAccount);
        savingAccountLinkedList.add(savingAccount);

    }

    public void displayAccount() {
        System.out.println("Saving Account:");
        System.out.println("Initial Deposit:  $"+savingAccount.getBalance());
        System.out.println("Interest rate: "+savingAccount.getInterestRate()+"%");
    }

    public static BigDecimal inputIntialDeposit(SavingAccount savingAccount) {
        while (true) {
            try {
                System.out.println("Please enter Initial Deposit your Saving account: ");
                BigDecimal amount = scanner.nextBigDecimal();
                savingAccount.setBalance(amount);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Not number. Please try again");
                scanner.nextLine();
            }
        }
        return savingAccount.getBalance();
    }

    public static double inputInterestRate(SavingAccount savingAccount) {
        while (true) {
            try {
                System.out.println("Please enter Interest rate your Saving account: ");
                double interestRate = scanner.nextDouble();
                savingAccount.setInterestRate(interestRate);
                break;
            }catch (InputMismatchException e) {
                System.out.println("Not number. Please try again");
                scanner.nextLine();
            }
        }
        return savingAccount.getInterestRate();
    }
}
