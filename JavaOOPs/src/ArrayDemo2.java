class Arraydemo4{
    static int run(int arr[],int target,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

public class ArrayDemo2 {
    public static void main(String[] args) {
        Arraydemo4 a = new Arraydemo4();
        int arr[]={49,50,32,9,84};
        int n= arr.length;

        int result = Arraydemo4.run(arr, 9, n);
        System.out.println(result);

    }
}
