package Bank;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount account1 = new BankAccount("Vlad", 1);
        BankAccount account2 = new BankAccount("Daniel", 2);


        bank.addAccount(account1);
        bank.addAccount(account2);


        bank.blockAccount(account1);

        System.out.println(account1.getName());

        account1.addMoney(400);
        account1.sendMoney(100, account2);
        account1.getBalance();
    }


}
