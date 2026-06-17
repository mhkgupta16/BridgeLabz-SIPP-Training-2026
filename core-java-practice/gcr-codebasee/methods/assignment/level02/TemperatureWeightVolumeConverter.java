import java.util.Scanner;

public class TemperatureWeightVolumeConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Celsius = " + fahrenheitToCelsius(fahrenheit));

        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));

        System.out.print("Enter Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Kilograms = " + poundsToKilograms(pounds));

        System.out.print("Enter Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("Pounds = " + kilogramsToPounds(kilograms));

        System.out.print("Enter Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Liters = " + gallonsToLiters(gallons));

        System.out.print("Enter Liters: ");
        double liters = sc.nextDouble();
        System.out.println("Gallons = " + litersToGallons(liters));
    }
}