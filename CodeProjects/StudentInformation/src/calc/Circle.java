package calc;

public class Circle {
	double Radius = 0;
	
	void calculateArea() {
		double Area = 3.1416 * Radius * Radius;
		System.out.println((int)Area);
	}
}
