package Task2.program3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        // using constructor to initialize the account number and balance
        Account acc = new Account(1234567,1000);
        System.out.println("CURRENT BALANCE");
        acc.displayBalance();
        System.out.println("Enter amount to deposit");
        int deposit = ch.nextInt();
        acc.deposit(deposit);
        System.out.println("Enter amount to withdraw");
        int withdraw = ch.nextInt();
        acc.withrawal(withdraw);
        acc.displayBalance();  // displays the balance after deposit and withdrawal
    }
}
