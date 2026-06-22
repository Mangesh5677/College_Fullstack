import java.util.Scanner;

public class Greatest_of_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int First=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int Second=sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int Third=sc.nextInt();
        System.out.println("3 Numbers Are :"+First+","+Second+","+Third);

        if(First>Second && First>Third){
            System.out.println("Greatest Number is : "+First);
        }else if(Second>First && Second>Third){
            System.out.println("Greatest Number is : "+Second);
        }else {
            System.out.println("Greatest Number is : "+Third);
        }
    }
}
