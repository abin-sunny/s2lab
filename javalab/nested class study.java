/*
  Certainly! Let’s consider a real-world scenario where nested classes in Java can be useful.
  Imagine you’re building a banking application that manages customer accounts. In this application,
  you can use nested classes to organize related functionality and improve code structure.

Problem: Implementing a Banking System
Outer Class: Bank
The Bank class represents the overall banking system.
It contains information about the bank, such as its name, location, and services.
The Bank class also manages customer accounts.


Static Nested Class: AccountType
The AccountType class is a static nested class within the Bank.
It defines different types of bank accounts (e.g., savings, checking, fixed deposit).
Each account type has specific rules, interest rates, and minimum balances.
By encapsulating account-related details in this nested class, you keep them organized and separate from other parts of the application.


Non-Static Inner Class: CustomerAccount
The CustomerAccount class is an inner class within the Bank.
It represents an individual customer’s account.
Each customer account has properties like account number, balance, and account type.
The inner class can directly access the outer class’s instance variables (e.g., bank name).
Here’s a simplified implementation:
  */

class Bank {
    private String bankName;
    private String location;

    // Constructor for Bank
    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    // Static nested class for account types
    static class AccountType {
        private String typeName;
        private double interestRate;

        public AccountType(String typeName, double interestRate) {
            this.typeName = typeName;
            this.interestRate = interestRate;
        }

        // Getters for account type details
        public String getTypeName() {
            return typeName;
        }

        public double getInterestRate() {
            return interestRate;
        }
    }

    // Non-static inner class for customer accounts
    class CustomerAccount {
        private int accountNumber;
        private double balance;
        private AccountType accountType;

        public CustomerAccount(int accountNumber, double balance, AccountType accountType) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.accountType = accountType;
        }

        // Methods for account operations (deposit, withdrawal, etc.)
        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        // Getters for account details
        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public AccountType getAccountType() {
            return accountType;
        }
    }

    // Other methods for managing accounts, bank services, etc.
    // ...
}

public class BankingApp {
    public static void main(String[] args) {
        Bank myBank = new Bank("MyBank", "City Center");

        // Create account types
        Bank.AccountType savings = new Bank.AccountType("Savings", 0.02);
        Bank.AccountType checking = new Bank.AccountType("Checking", 0.01);

        // Create customer accounts
        Bank.CustomerAccount customer1 = myBank.new CustomerAccount(1001, 5000, savings);
        Bank.CustomerAccount customer2 = myBank.new CustomerAccount(2001, 10000, checking);

        // Perform account operations
        customer1.deposit(1000);
        customer2.withdraw(2000);

        // Display account details
        System.out.println("Customer 1 balance: $" + customer1.getBalance());
        System.out.println("Customer 2 account type: " + customer2.getAccountType().getTypeName());
    }
}
