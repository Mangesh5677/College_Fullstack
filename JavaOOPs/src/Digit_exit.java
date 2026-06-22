import java.util.Scanner;

public class Digit_exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num =sc.nextInt();
        System.out.println("Enter the Digit Check it Exist or Not :");
        int target=sc.nextInt();

        boolean found = false;

        while (num > 0) {
            int digit = num % 10;

            if (digit == target) {
                found = true;
                break;
            }

            num /= 10;
        }
        if (found) {
            System.out.println("Digit exists");
        } else {
            System.out.println("Digit does not exist");
        }
    }
}
