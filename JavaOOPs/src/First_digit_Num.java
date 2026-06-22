import java.util.Scanner;

public class First_digit_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        int original=num;

        while(num>9){
            num/=10;
        }
        System.out.println("First digit of the "+original+" is "+num);
    }
}
