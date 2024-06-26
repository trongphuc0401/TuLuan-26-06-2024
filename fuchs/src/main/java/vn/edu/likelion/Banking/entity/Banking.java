package vn.edu.likelion.Banking.entity;

import java.util.LinkedList;

/**
 * Banking -
 *
 * @param
 * @return
 * @throws
 */
public class Banking {
    private LinkedList<CurrentAccount> currentAccounts;
    private LinkedList<SavingAccount> savingAccounts;

    public Banking() {}

    public Banking(LinkedList<CurrentAccount> currentAccounts, LinkedList<SavingAccount> savingAccounts) {
        this.currentAccounts = currentAccounts;
        this.savingAccounts = savingAccounts;
    }

    public LinkedList<CurrentAccount> getCurrentAccounts() {
        return currentAccounts;
    }

    public void setCurrentAccounts(LinkedList<CurrentAccount> currentAccounts) {
        this.currentAccounts = currentAccounts;
    }

    public LinkedList<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public void setSavingAccounts(LinkedList<SavingAccount> savingAccounts) {
        this.savingAccounts = savingAccounts;
    }
}
