package com.pluralsight;

public class CreditCard implements IValuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void charge(double amount){
        System.out.println("Charged your account");
    }

    public void pay(double amount){
        System.out.println("Payed");
    }

    @Override
    public double getValue() {
        return 0;
    }
}
