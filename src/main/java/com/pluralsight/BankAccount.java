package com.pluralsight.assets;

public class BankAccount extends Asset {
    private String accountNumber;
    private double balance;
    public BankAccount(String description,
                       String dateAcquired,
                       double originalCost,
                       String accountNumber,
                       double balance) {
        super(description, dateAcquired, originalCost);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}