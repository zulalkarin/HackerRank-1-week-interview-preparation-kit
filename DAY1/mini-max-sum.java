import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // I will use long because I need 64-bit integer.
    
     long min = arr.get(0);
     long max = arr.get(0);
     long sum = 0;
     
     for(int val : arr){
         if(val < min){
             min = val;
         }
         if(val > max){
             max = val;
         }
         
         sum += val;
     }
     
     long minSum = sum-max;
     long maxSum = sum-min;
     
     System.out.println(minSum + " " + maxSum);
      

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}