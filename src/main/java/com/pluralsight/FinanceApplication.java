package com.pluralsight;

import com.pluralsight.finance.BankAccount;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Zain", "Ashraf", 2);
        BankAccount account2 = new BankAccount("Zain", "Ashraf", 2);
// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);
    }
}
