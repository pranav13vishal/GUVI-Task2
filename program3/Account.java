package Task2.program3;

public class Account {
    int balance;
    int accountNumber;

    // default constructor
    public Account() {
        this.balance = 0;
    }
    // parameterised constructor
    public Account(int accountNumber, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // method to subtract the withdrawal amount with the current balance
    public void withrawal(int amt) {
        this.balance = this.balance-amt;
    }

    // method to add the deposit with the current balance
    public void deposit(int amt) {
        this.balance = this.balance+amt;
    }

    // To display the account number and balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs." + balance);
    }
}
