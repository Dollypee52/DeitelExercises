package tdd;

public class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount<0){balance = 0;}
        else
        balance= balance + amount;

    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){ if(amount> 0 && balance > amount)
    { balance = balance - amount;}
    }
}
