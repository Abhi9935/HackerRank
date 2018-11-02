/*
# Odd Numbers!
Given two integers, l and r, print all the odd numbers between l and r (l and r inclusive). 

 

Complete the oddNumbers function in the editor below. It has 2 parameters:

An integer, l, denoting the left part of the range.
An integer, r, denoting the right part of the range.
The function must return an array of integers denoting the odd numbers between l and r.

 

# Input Format

Locked stub code in the editor reads the following input from stdin and passes it to the function:

The first line contains an integer, l, denoting the left part of the range.

The second line contains an integer, r, denoting the right part of the range.

 

Constraints

1 ≤ l ≤ r ≤ 105
 

Output Format

The function must return an array of integers denoting the odd numbers between l and r. This is printed to stdout by locked stub code in the editor.

 

Sample Input 0

2
5
 

Sample Output 0

3
5
 

Explanation 0

The value of l is 2 and value of r is 5. The odd numbers between [2, 5] are 3 and 5.

 

Sample Input 1

3
9
 

Sample Output 1

3
5
7
9
 

Explanation 1

The value of l is 3 and value of r is 9. The odd numbers between [3, 9] are 3, 5, 7 and 9.

 

# YOUR ANSWER
# JAVA Solution ...
*/
//
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the oddNumbers function below.
    static List<Integer> oddNumbers(int l, int r) {
        List<Integer> al=new ArrayList<Integer>();
        for(int i=l;i<=r;i++){
            if(!(i%2==0)){
                al.add(i);
            }
        }
        return al;
    }

 public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

