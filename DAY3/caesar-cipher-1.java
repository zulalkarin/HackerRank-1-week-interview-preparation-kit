import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    
    String alphabetLower = "abcdefghijklmnopqrstuvwxyz";
    String alphabetUpper =alphabetLower.toUpperCase();
    String ans="";
   
    for(int i = 0; i<s.length(); i++){   
        if(Character.isLetter(s.charAt(i))){
            for(int j=0; j<26; j++){
                if(s.charAt(i) == alphabetLower.charAt(j)){ 
                   int a= (j+k)%26;
                   ans += alphabetLower.charAt(a);
               
                 }
                if(s.charAt(i) == alphabetUpper.charAt(j)){    
    
                  int a= (j+k)%26;
                   ans += alphabetUpper.charAt(a);
                   
                }
            }
        }
        else{
            ans += s.charAt(i);
         }      
    }   
    return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
