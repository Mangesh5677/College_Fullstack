class Arraydemo{
    static int run(int arr[],int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}


public class ArrayDemo3 {
    public static void main(String[] args) {
        Arraydemo a = new Arraydemo();
        int arr[]={49,50,92,9,84};
        int n= arr.length;
        int result = Arraydemo.run(arr,n);
        System.out.println(result);
    }
}
