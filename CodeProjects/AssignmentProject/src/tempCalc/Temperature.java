package tempCalc;

public class Temperature {

    void toCelcius(double fahrenheit) {
        double theCel = (fahrenheit - 32) * (5.0/9.0);
        System.out.printf("%.2f \n", theCel);
    }

    void toFahrenheit(double celsius) {
        double theFah = (celsius * 9.0/5.0) + 32;
        System.out.printf("%.2f \n", theFah);
    }
    
}
