public class StarPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
             }
            for(int row=1;row<=2*(5-i);row++){
                System.out.print("_ ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
//output:
//        * _ _ _ _ _ _ _ _ *
//        * * _ _ _ _ _ _ * *
//        * * * _ _ _ _ * * *
//        * * * * _ _ * * * *
//        * * * * * * * * * *