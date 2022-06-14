package AssignmentTest.tddClass;

public class Acct {
    private double balance;


    public void deposit(double amount) {
        if(amount <0){balance = 0;}

        else
            balance = balance + amount;
    }

    public double getBalance() {
        return balance;}

    public void withdrawal(double amount) {
        if(amount > 0 && balance > 0)
            balance = balance - amount;

    }
}

