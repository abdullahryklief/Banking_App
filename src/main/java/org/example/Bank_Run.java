package org.example;

/*
- Bank_Run
- Abdullah Ryklief
- 215245105
- 18/02/2020
*/

public class Bank_Run
{
    public static void main(String [] args)
    {
        Bank b = new Bank("Abdullah Ryklief", 215245105, 1000.00);

        System.out.println(b.showBalance());

        b.deposit(500.00);

        System.out.println(b.showBalance());

        if(b.withdraw(700.00) == true)
        {
            System.out.println(b.showBalance());
        }else
        {
            System.out.println("Withdrawal amount exceeds balance");
        }


    }
}
