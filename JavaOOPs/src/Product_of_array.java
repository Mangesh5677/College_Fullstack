import java.util.Arrays;

public class Product_of_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n= arr.length;
        int product=1;
        for(int i=0;i<n;i++){
            product*=arr[i];
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
           ans[i]=product/arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
