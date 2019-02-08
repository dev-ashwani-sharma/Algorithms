import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int small1=0, small2=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a_i == 0){
                small1 = Math.abs(a[a_i]);
            }
            else if(a_i == 1){
                if(Math.abs(a[a_i]) < small1){
                    small2 = small1;
                    small1 = Math.abs(a[a_i]);
                }
                else{
                    small2 = Math.abs(a[a_i]);
                }
            }
            else{
                if(small2 > Math.abs(a[a_i]) && small1 < Math.abs(a[a_i])){
                    small2 = Math.abs(a[a_i]);
                }
                else if(small2 > Math.abs(a[a_i]) && small1 > Math.abs(a[a_i])){
                    small2 = small1;
                    small1 = Math.abs(a[a_i]);
                }
            }
        }
        
        System.out.println(Math.abs(small2 - small1));
        
        // your code goes here
    }
}
