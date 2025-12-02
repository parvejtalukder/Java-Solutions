package bankSystem;

public class SavingsAccount extends Account {

    double interestRate;

    void accountInfo() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Initial Balance: " + balance + " BDT");
    }

    void deposit(double deposited) {
        if (deposited <= 0) {
            System.out.println("Deposit Error, Need up to 0");
            return;
        } else {
            balance += deposited;
            System.out.println("Deposited " + deposited + " BDT");
            System.out.println("Balance After Deposit: " + balance + " BDT");
        }
    }

    void withdraw(double withdrawAmount) {
        if (balance < withdrawAmount) {
            System.out.println("Insuficent Balance");
            return;
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw " + withdrawAmount + " BDT");
            System.out.println("Balance After Withdraw: " + balance + " BDT");
        }
    }

    void interestCalc() {
        if (balance > 0.00) {
            double interest = balance * (interestRate/100.0);
            System.out.println("Yearly Interest: " + interest + " (With " + interestRate + " %)" );
        }
    }

}