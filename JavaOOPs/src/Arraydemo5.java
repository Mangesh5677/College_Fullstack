public class Arraydemo5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,4,1};
        int n= arr.length;
        int element=0;
        int MaxFreq=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>MaxFreq){
                MaxFreq=count;
                element=arr[i];
            }
        }
        System.out.println("Element Of the MaxFreq-->"+element);
    }
}
