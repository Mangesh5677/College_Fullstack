public class StarPattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int n=5;n>=i+1;n--){
                System.out.print("_ ");
            }
            for(int n=5;n>=i+1;n--){
                System.out.print("_ ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}
