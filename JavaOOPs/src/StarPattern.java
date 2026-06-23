class Pattern1{
void Ptr(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int row=1;row<=2*(n-i);row++){
            System.out.print("_ ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}
}
public class StarPattern {
    public static void main(String[] args) {
        Pattern1 p = new Pattern1();
        p.Ptr(5);
        System.out.println("   ");
        p.Ptr(6);
    }
}
//output:
//        * _ _ _ _ _ _ _ _ *
//        * * _ _ _ _ _ _ * *
//        * * * _ _ _ _ * * *
//        * * * * _ _ * * * *
//        * * * * * * * * * *