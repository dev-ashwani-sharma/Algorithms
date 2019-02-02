import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
    static int[] kaprekarNumbers(int p, int q) {
        int[] numbers = new int[q-p+1];
        int counter = 0;
        Arrays.fill(numbers, 0);
        for(int i=0; i<=(q-p+1); i++) {
            long num = i+p;
            int length = new String(num+"").length();
            long square = (num*num);
            String s = square+"";
            int slength = s.length();
            String l = s.substring(0, slength-length)+"";
            String r = s.substring(slength-length);
            int il = 0;
            if(l.length() > 0)
                il = Integer.parseInt(l);
            int ir = Integer.parseInt(r);
            if(il+ir == num) {
                numbers[i] = 1;
                counter++;
            }
            // System.out.print(", num = "+num);
        }
        int[] result = new int[counter];
        if(counter != 0) {
            for(int itr=0,i=0; i<(q-p+1); i++) {
                int num = i+p;
                if(numbers[i] == 1) {
                    result[itr] = num;
                    itr++;
                }
            }
        }
    return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] result = kaprekarNumbers(p, q);
    
        if(result.length > 0) {
            for (int i = 0; i < result.length; i++) {
                System.out.println(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    System.out.println(" ");
                }
            }
        }
        else {
            System.out.println("INVALID RANGE");
        }

        System.out.println();

        //bufferedWriter.close();

        scanner.close();
    }
}
