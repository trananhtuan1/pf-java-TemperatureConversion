import java.util.Scanner;

public class TemperatureConversion {


    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius: ");
        System.out.println("2. Celsius to Fahrenheit: ");

        System.out.println("0. Exit: ");
        System.out.println("Enter your choice: ");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter Fahrenheit ");
                fahrenheit = scanner.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Enter Celsius ");
                celsius = scanner.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 0:
                System.exit(0);
        }
    }

    public static double fahrenheitToCelsius(double celsius) {
        double fahrenheit = (9 / 5.0) * (celsius - 32);
        return fahrenheit;
    }

    public static double celsiusToFahrenheit(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
