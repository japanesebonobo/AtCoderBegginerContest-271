package src;
import java.util.*;

public class A_484558 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        String ans = "";

        ans = Integer.toHexString(N).toUpperCase();

        if (ans.length() == 1) {
            ans = "0" + ans;
        }
        System.out.println(ans);
    }
}

