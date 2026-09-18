package Talleres.Taller01;

public class BankAccount {

    private double balance;
    private int account;
    private String name;

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }

}
