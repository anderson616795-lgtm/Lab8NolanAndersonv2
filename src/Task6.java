import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsiusValue = helper.getDouble(scanner, "Enter temperature in Celsius:");
        double fahrenheitValue = helper.celsiusToFahrenheit(celsiusValue);
        System.out.printf("Equivalent Fahrenheit: %.2f%n", fahrenheitValue);
    }
}