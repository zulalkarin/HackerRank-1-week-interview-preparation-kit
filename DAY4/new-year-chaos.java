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
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    // Write your code here
    int numOfBribes=0;
    int bribeForOneNum;
    boolean flag=true;
 
    for(int i=0 ;i<q.size()-1; i++){
        bribeForOneNum =0;
        for(int j=i+1 ;j<q.size(); j++){
            if(q.get(i) > q.get(j)){
                numOfBribes++;
                bribeForOneNum++;
                 if(bribeForOneNum>2){
                    flag =false;
                }
            }
       }
            
    }
    if(flag ==false){
       System.out.println("Too chaotic");
    }
    else
      System.out.println(numOfBribes);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
