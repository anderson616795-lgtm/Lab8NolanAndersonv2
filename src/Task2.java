import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int favInt = helper.getInt(scan, "Please enter your favorite int: ");
        double favDouble = helper.getDouble(scan, "Please enter your favorite double: ");
        System.out.println("Your favorite int is " + favInt + ". Your favorite double is " + favDouble + ".");
    }
}