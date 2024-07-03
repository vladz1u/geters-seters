package Bank;

public class BankAccount {
    private String name;
    private int id;
    boolean freeze;
    private double balance;

    public BankAccount(String name, int id) {
        this.name = name;
        this.id = id;
        this.freeze = false;
        this.balance = 0;
    }

    public void addMoney(double money) {
        balance += money;
    }

    public void takeMoney(double money) {
        if (!this.freeze) {
            if (balance >= money) {
                balance -= money;
            } else {
                System.out.println("You isn't enough money on your account");
            }
        } else
            System.out.println("Your account are frozen");
    }

    public void sendMoney(double money, BankAccount accountExt) {
        if (!this.freeze) {
            if (balance >= money) {
                balance -= money;
                accountExt.addMoney(money);
                System.out.println("Money transfer completed successfully");
            } else {
                System.out.println("Not enough money to transfer\n");
            }
            return;
        } else
            System.out.println("Your account are frozen");


    }

    public void getBalance() {
        System.out.println("Balance of your account equals: " + balance + " (" + this.name + ")");
    }

    public String getName(){
        return name;
    }

    public Integer getId(){
        return id;
    }

    public void setName(String setName){
        name = setName;
    }
}