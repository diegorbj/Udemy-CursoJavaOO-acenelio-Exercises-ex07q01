package entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        this.deposit(initialDeposit);
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        double tax = 5.00;
        this.balance -= (amount + tax);
    }

    public String toString() {
        return "Account " + this.getNumber() + ", Holder: " + this.getHolder() + ", Balance: $ " + String.format("%.2f", this.getBalance());
    }
}
