public class StarPattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
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
