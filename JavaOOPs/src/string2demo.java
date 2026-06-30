public class string2demo {
    public static void main(String[] args) {
        String str="abcaabbaabbccddeefa";
        int n=str.length();
        int[] arr=new int[26];

        for(int i=0;i<n;i++){
            int idx=str.charAt(i)-'a';
            arr[idx]++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println((char)(i+'a')+"="+arr[i]);
        }
    }
}
