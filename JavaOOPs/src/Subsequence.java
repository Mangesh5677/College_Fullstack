public class Subsequence {
    public static void main(String[] args) {
        sub("abc",0,"");
    }
    public static void sub(String s,int i,String ans){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }

        //pick
        sub(s,i+1,ans+s.charAt(i));
        //not Pick
        sub(s,i+1,ans);
    }
}
