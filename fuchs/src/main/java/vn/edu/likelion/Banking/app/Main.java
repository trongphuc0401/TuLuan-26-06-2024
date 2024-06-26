package vn.edu.likelion.Banking.app;

import vn.edu.likelion.Banking.entity.CurrentAccount;
import vn.edu.likelion.Banking.entity.SavingAccount;
import vn.edu.likelion.Banking.service.CurrentAccountService;
import vn.edu.likelion.Banking.service.SavingAccountService;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Main - app to run Banking app
 *
 * @param
 * @return
 * @throws
 */
public class Main {

    private static CurrentAccountService currentAccountService = new CurrentAccountService();
    private static SavingAccountService savingAccountService = new SavingAccountService();

    static CurrentAccount currentAccount = new CurrentAccount();
    static SavingAccount savingAccount = new SavingAccount();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("----------------Saving Account----------------");
        savingAccountService.addAccount();
        System.out.println("Enter number of deposit you want: ");
        BigDecimal depositSavingAccount = scanner.nextBigDecimal();
        System.out.println("Enter number of withdraw you want: ");
        BigDecimal withdrawSavingAcount = scanner.nextBigDecimal();
        System.out.println("");
        System.out.println("----------------Current Account----------------");
        currentAccountService.addAccount();
        System.out.println("Enter number of deposit you want: ");
        BigDecimal depositCurrentAccount = scanner.nextBigDecimal();

        System.out.println("");

        savingAccountService.displayAccount();
        System.out.println("");
        currentAccountService.displayAccount();
        System.out.println("");

        savingAccountService.deposit(depositSavingAccount);
        currentAccountService.deposit(depositCurrentAccount);
        savingAccountService.withdraw(withdrawSavingAcount);
        System.out.println("");

        System.out.println("Saving A/c and Current A/c.:");
        System.out.println("Account balance: "+ savingAccountService.getBalance());
        System.out.println("Account balance: "+ currentAccountService.getBalance());

        System.out.println("");
        System.out.println("After applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c.:");
        savingAccountService.calculateInterestRate();
        currentAccountService.calculateInterestRate();
        System.out.println("Account balance: "+ savingAccountService.getBalance());
        System.out.println("Account balance: "+ currentAccountService.getBalance());

    }
}
