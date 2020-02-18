package org.example;

/*
- Bank
- Abdullah Ryklief
- 215245105
- 18/02/2020
*/

public class Bank
{
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public Bank(){}

    public Bank(String accountHolder, long accountNumber, double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double money)
    {
        balance += money;
    }

    public boolean withdraw(double money)
    {
        if (money <= balance)
        {
            balance -= money;
            return true;
        }else{
            return false;
        }
    }

    public String showBalance()
    {
        return String.format ("Account Holder: %S\nAccount Number: %d\nAccount Balance: %.2f", accountHolder, accountNumber, balance);
    }
}
