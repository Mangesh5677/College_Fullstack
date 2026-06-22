import java.util.Scanner;

public class Avg_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        double avg = (double) sum / n;
        System.out.println("Average = " + avg);
    }
}
