package simpleInterestCalculator;

public class Main {

    public static void main(String[] args) {
        InterestCalculator myBank = new InterestCalculator();
        myBank.principal = 1000;
        myBank.rate = 5;
        myBank.time = 7;
        myBank.calculate();
    }
    
}
