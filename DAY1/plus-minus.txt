import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/*Given an array of integers, calculate the ratios of its 
elements that are positive, negative, and zero. Print the 
decimal value of each fraction on a new line with 6 places after the decimal.*/

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    double size = arr.size();
    double plus=0;
    double zero=0;
    double minus=0;
    
    for(int var : arr){
        if(var>0){
            plus++;
        }
        else if(var == 0){
            zero++;
        }
        else if(var<0){
            minus++;
        }
        else{
            System.out.println("array members are not valid. ");
        }
    }
        
    double plusRatio = (double) (Math.round((plus/size)*1000000.0)/1000000.0);
    double zeroRatio = (double) (Math.round((zero/size)*1000000.0)/1000000.0);
    double minusRatio = (double) (Math.round((minus/size)*1000000.0)/1000000.0);
    
    System.out.println(plusRatio);
    System.out.println(minusRatio);
    System.out.println(zeroRatio);


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
