package bankSystem;

public class Main {

    public static void main(String[] args) {
        SavingsAccount davidAc = new SavingsAccount();
        davidAc.holderName = "Mr. David Keyiya";
        davidAc.accountNumber = 94589374;
        davidAc.balance = 1000000;
        davidAc.interestRate = 20;
        davidAc.accountInfo();
        davidAc.deposit(500);
        davidAc.withdraw(20000);
        davidAc.interestCalc();
    }
    
}
