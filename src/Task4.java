import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean hasMoreItems = true;
        System.out.println("Welcome to the $10 Store!");
        while (hasMoreItems) {
            double price = helper.getRangedDouble(in, "Enter the price of your item", 0.50, 9.99);
            totalCost += price;
            hasMoreItems = helper.getYNConfirm(in, "Do you have more items to enter?");
        }
        System.out.printf("\nYour total cost is: $%.2f\n", totalCost);
        System.out.println("Thank you for shopping with us!");
    }
}