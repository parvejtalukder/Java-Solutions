package circleAreaCalculation;

public class Circle {

    double radius;
    void calculateArea() {
        double circleCalc = 3.1416 * radius * radius;
        System.out.println(String.format("%.2f", circleCalc));
    }

}