package Bank;

import java.util.ArrayList;

public class Bank {
    static ArrayList<BankAccount> listAccounts = new ArrayList<>();


    public void addAccount(BankAccount bankAccount){
        listAccounts.add(bankAccount);
    }

    public void blockAccount(BankAccount bankAccount){
        bankAccount.freeze = true;
        System.out.println("Account which id is " + bankAccount.getId() + " was blocked");
    }

    public void unBlockAccount(BankAccount bankAccount){
        bankAccount.freeze = false;
        System.out.println("Account which id is " + bankAccount.getId() + " was unblocked");

    }
}
