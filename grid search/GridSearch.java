import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GridSearch {
    // Complete the gridSearch function below.
    static String gridSearch(String[] grid, String[] pattern) {
        int R = grid.length, C = grid[0].length(), r = pattern.length, c = pattern[0].length(), lm=0, pm=0, ll, itr=0;
        for(int a=0 ; a<=R-r ; a++) {
            for(int b=0 ; b<=C-c ; b++) {
                String subString = grid[a].substring(b,b+c);
                if(subString.equals(pattern[0])){
                    lm = 1;
                }
                else {
                    lm = 0;
                }
                if(lm == 1) {
                    ll = b;
                    itr = 1;
                    for(int i=1; i<=r-1; i++) {
                        String subString2 = grid[a+i].substring(b,b+c);
                        if(subString2.equals(pattern[i])){
                            lm = 1;
                        }
                        else {
                            lm = 0;
                        }
                        if(lm!=1) {
                            break;
                        }
                        else{
                            itr++;
                        }
                    }
                    if(itr==r) {
                        pm = 1;
                    }
                }
                if(pm == 1) {
                    a=R;
                    b=C;
                }
            }
        }
        if(pm==1)
            return "YES";
        else 
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] ans = new String[t];

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            ans[tItr] = gridSearch(G, P);
        }

        for(int i = 0; i<t; i++) {
        	System.out.println(ans[i]);
        }
        scanner.close();
    }
}
