import java.util.Arrays;

class swap{
    static int[] reverseArray(int[] arr, int n) {
        // code here
        int l=0;
        int r=n-1;

        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return arr;
    }
}



public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={3,5,2,8,6};
        int n= arr.length;

        int[] result = swap.reverseArray(arr,n);
        System.out.println(Arrays.toString(result));
    }
}
