package org.example;

public class BackAccount {
    private double balance;

    public BackAccount(double balance) {
        if(balance > 0){
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited " + amount + " to " + this.balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            balance -= amount;
            System.out.println("Withdrawn " + amount + " to " + this.balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }


}
