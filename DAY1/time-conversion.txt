import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

     public static String timeConversion(String s) {
    // Write your code here
    //07:05:45PM
   
    String hourStr = s.substring(0, 2);
    int hourInt = Integer.parseInt(hourStr);
    
    
    if(s.charAt(8) == 'P'){ //PM
      if(hourInt < 12){
          hourInt = hourInt + 12;
      }
        
        
    }
    if(s.charAt(8) == 'A'){ //AM
     if(hourInt == 12){
         hourInt = 0; //turn it to 00 
     }
   
    } 
    String zero = "0";
    String newHour = Integer.toString(hourInt);
    if(newHour.equals("0")){
        newHour.concat("0");
    }
    if(newHour.length() == 1){
        newHour = zero + newHour;
    }
    String sSecond = s.substring(2, 8);
    
    String newS =newHour + sSecond;
  
   
    return newS;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
