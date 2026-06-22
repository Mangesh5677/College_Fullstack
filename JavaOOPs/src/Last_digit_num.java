import java.util.Scanner;

public class Last_digit_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        while(num>0){
            num%=10;
            break;
        }
        System.out.println("Last digit of thus number is : "+num);
    }
}
