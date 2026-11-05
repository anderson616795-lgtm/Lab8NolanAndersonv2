import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ssn = helper.getRegExString(scan, "Enter your SSN (XXX-XX-XXXX):", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSn is : " + ssn);
        String mNum = helper.getRegExString(scan, "Enter your UC Student M number (e.g., M12345):", "(M|m)\\d{5}");
        System.out.println("Your M number is : " + mNum);
        String menuChoice = helper.getRegExString(scan,"Enter menu choice [O for open/S for save/V for veiw/Q for quit]:", "[OoSsVvQq]");
        System.out.println("Valid menu choice received: " + menuChoice);
    }
}