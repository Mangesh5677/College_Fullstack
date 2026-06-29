import java.security.spec.RSAOtherPrimeInfo;

public class string_demo {
    public static void main(String[] args) {
        String str="Hello World Java";

        String ans[]=str.split(" ");
        for (int i = ans.length - 1; i >= 0; i--) {
            System.out.print(ans[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
