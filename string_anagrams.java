//incomplete

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int get_count(char[] a, char b){
        char[] a_arr = a;
        int count = 0;
        for(int i =0;i<a_arr.length;i++){
            if (a_arr[i] == b)
            count++;
        }
        return count;
    }

    static int makeAnagram(String a, String b) {

        int to_delete = 0;
        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();
        for(int i =0;i<a_arr.length;i++){
            if (!b.contains(Character.toString(a_arr[i]))) {
                to_delete++;
            }  
        }
        for(int i =0;i<b_arr.length;i++){
            if (!a.contains(Character.toString(b_arr[i]))) {
                to_delete++;
            }
            
        }
        
        return to_delete;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
