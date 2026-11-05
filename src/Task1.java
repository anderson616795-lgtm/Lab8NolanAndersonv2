import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = helper.getNonZeroLenString(scan, "Please enter your name:");
        System.out.println("Hello, " + name + "!");

    }
}