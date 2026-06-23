import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n= sc.nextInt();
        int arr[] =new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the array elements of the "+i+" index:");
            arr[i]= sc.nextInt();
        }

        for(int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
