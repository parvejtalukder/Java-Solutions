package tempConverter;

public class Temperature {

    void toCelcius(double fahrenheit) {
        double fah = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println((int)fah);
    }

    void toFahrenheit(double celsius) {
        double cel = (celsius * (9.0/5.0) + 32);
        System.out.println((int)cel);
    }

}
