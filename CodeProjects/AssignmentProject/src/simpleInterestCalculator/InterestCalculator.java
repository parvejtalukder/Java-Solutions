package simpleInterestCalculator;

class InterestCalculator {

    double principal;
    double rate;
    double time;

    void calculate() {
        System.out.println((principal * rate * time) / 100);
    }

}