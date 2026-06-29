public class stringdemo {
    public static void main(String[] args) {
        String s1="ABC";
        String s2="ABC";
        String s3=new String("ABC");

        if(s1==s3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
