package interestCalculator;

public class InterestCalculator {
    int principal, rate, time;
    void calculate() {
        int interest = (principal * rate * time) / 100;
        System.out.println(interest);
    }
}