package src;
import java.util.*;

public class B_MaintainMultipleSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int N  = scanner.nextInt();
        long Q  = scanner.nextInt();
        List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    
        for (int i = 0; i < N; i++) {
            ArrayList<Integer> l = new ArrayList<>();
            a.add(i,l);
            long L = scanner.nextInt();
            for (int j = 0; j < L; j++) {
                a.get(i).add(j,scanner.nextInt());
            }
        }
    
        long ans = 0;
        for (int i = 0; i < Q; i++) {
            int s = scanner. nextInt();
            int t = scanner.nextInt();
            s--;
            t--;
    
            ans = a.get(s).get(t);
            System.out.println(ans);
        }
        scanner.close();
    }
}

