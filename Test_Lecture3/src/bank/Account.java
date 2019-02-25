package bank;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;


    public Account() {
        this(0, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {

        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {

        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {

        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {

        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {

        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {

        return this.balance * this.getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
