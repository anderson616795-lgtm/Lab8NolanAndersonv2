import java.util.Scanner;

public class helper {

    public static String getNonZeroLenString(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            String input = scan.nextLine();
            if (!input.trim().isEmpty()) {
                return input;
            }
            System.out.println("Error. Input cannot be empty. Please try again.");
        }
    }

    public static int getInt(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            if (scan.hasNextInt()) {
                int result = scan.nextInt();
                scan.nextLine();
                return result;
            } else {
                scan.nextLine();
                System.out.println("Error. Invalid integer entered. Please try again.");
            }
        }
    }

    public static double getDouble(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " ");
            if (scan.hasNextDouble()) {
                double result = scan.nextDouble();
                scan.nextLine();
                return result;
            } else {
                scan.nextLine();
                System.out.println("Error. Invalid double entered. Please try again.");
            }
        }
    }

    public static int getRangedInt(Scanner scan, String prompt, int min, int max) {
        while (true) {
            int value = getInt(scan, prompt + " [" + min + " - " + max + "]:");
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Error. Input [" + value + "] is out of range [" + min + " - " + max + "].");
        }
    }

    public static double getRangedDouble(Scanner scan, String prompt, double min, double max) {
        while (true) {
            double value = getDouble(scan, prompt + " [" + min + " - " + max + "]:");
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Error. Input [" + value + "] is out of range [" + min + " - " + max + "].");
        }
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        while (true) {
            int value = getInt(scan, prompt);
            if (value > 0) {
                return value;
            }
            System.out.println("Error. Input must be a positive, non-zero integer.");
        }
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            String input = scan.nextLine().trim();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            if (input.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Error. Invalid option. You must enter 'Y' for Yes or 'N' for No.");
        }
    }

    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        while (true) {
            System.out.print(prompt + " ");
            String input = scan.nextLine();
            if (input.matches(regExPattern)) {
                return input;
            }
            System.out.println("Error. Input does not match the required pattern.");
        }
    }

    public static double celsiusToFahrenheit(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32;
    }
}
