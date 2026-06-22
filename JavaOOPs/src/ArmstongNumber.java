import java.util.Scanner;

public class ArmstongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num =sc.nextInt();
        int temp =num;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        for(int i=1;i<=count;i++){

        }

    }
}
