
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   /*public static void fillRange(long[] arr, int a, int b, long k){
       if(a == b){
           arr[a-1] += k;
           return;
           /*System.out.println("Con 1:- a = "+a+" b = "+b+" array = "+Arrays.toString(arr));
           return arr[a-1];
       }
       else{
           arr[a-1] += k;
           /*long max = fillRange(arr, ++a, b, k);
           /*if(max < arr[a-1]){
               System.out.println("Con 2:- a = "+a+" b = "+b+" array = "+Arrays.toString(arr));
               return arr[a-1];
           }    
           else{
               System.out.println("Con 3:- a = "+a+" b = "+b+" array = "+Arrays.toString(arr));
               return max;
           }
       }
   }*/
   public static void main(String[] args) throws FileNotFoundException{
       File f = new File("input.txt");
       Scanner in = new Scanner(f);
       int n = in.nextInt();
       int m = in.nextInt();
       long[] arr = new long[n];
       Arrays.fill(arr, 0);
       long max = 0;
       for(int a0 = 0; a0 < m; a0++){
           int a = in.nextInt();
           int b = in.nextInt();
           long k = in.nextLong();
           //fillRange(arr, a, b, k);
           //System.out.println("Condition 4:- "+max);
           for(int i=a-1; i<b; i++){
               arr[i]+=k;
               if(max < arr[i])
                   max = arr[i];
           }
       }
       //Arrays.sort(arr);
       System.out.println(max);
       in.close();
   }
}