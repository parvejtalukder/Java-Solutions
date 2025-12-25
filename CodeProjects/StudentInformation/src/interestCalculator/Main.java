package interestCalculator;
public class Main {
    public static void main(String[] args) {
        InterestCalculator one = new InterestCalculator();
        one.principal = 500;
        one.time = 4;
        one.rate = 20;
        one.calculate();
        InterestCalculator two = new InterestCalculator();
        two.principal = 500;
        two.time = 4;
        two.rate = 5;
        two.calculate();
	}
}