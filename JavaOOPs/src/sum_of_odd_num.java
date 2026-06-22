import java.util.Scanner;

public class sum_of_odd_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i%2==1) {
                sum += i;
            }
        }
        System.out.print("Sum of 1 to "+n+" : "+sum);
    }
}
