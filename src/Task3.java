import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = helper.getRangedInt(scan, "Enter your birth year", 1950, 2010);
        int month = helper.getRangedInt(scan, "Enter your birth month", 1, 12);
        int day = helper.getRangedInt(scan, "Enter your birth day", 1, 31);
        int hours = helper.getRangedInt(scan, "Enter your birth hour", 1, 24);
        int minutes = helper.getRangedInt(scan, "Enter your birth minute", 1, 59);

        // Print Summary
        System.out.println("\n--- Birth Details Recorded ---");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hours);
        System.out.println("Minute: " + minutes);
    }
}