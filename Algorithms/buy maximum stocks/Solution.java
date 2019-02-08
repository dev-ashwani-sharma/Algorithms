import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long buyMaximumProducts(int n, long k, int[] a) {
        long res=0;
        for(int i=1; i<=n; i++){
            long temp = (long)(k/a[i-1]);
            if(temp > 0){
                long min = (long)(temp<i?temp:i);
                k-=(long)(min*a[i-1]);
                res+=min;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long k = in.nextLong();
        long result = buyMaximumProducts(n, k, arr);
        System.out.println(result);
        in.close();
    }
}
