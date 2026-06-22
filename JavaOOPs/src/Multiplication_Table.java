import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number You Want Print the Multiplication_Table of this number: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}
