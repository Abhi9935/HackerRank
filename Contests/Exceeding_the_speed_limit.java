/*
# All Contests > University Codesprint 5 > Exceeding the Speed Limit
# Exceeding the Speed Limit locked

Write a program that gets the speed of a driver on the highway (in km/h) and then applies the punishment ticket according to the following formula:

If the speed is less than or equal to 90, then the driver gets no punishment. There's also no fine.
If the speed is between 91 and 110 inclusive, then the punishment is a fine of (speed-90).300 plus a warning.
If the speed is greater than 110, then the punishment is a fine of (speed-90).500, plus having the license removed.

Input Format
You will be given a single integer s which determines the speed of the driver on the highway.

Constraints
	0<=s<=250
	
Output Format
Based on the speed of the driver and the formula explained above, print an integer and a string separated by a single space. The integer denotes the amount of fine in the punishment ticket, and the string is one of the following:

No punishment if there is no punishment.
Warning if there is a warning.
License removed if the license is removed.

Sample Input 0
100

Sample Output 0
3000 Warning

Explanation 0
Since the driver has exceeded the speed limit, the formula is applied as follows:
(100-90).300=3000
In addition to the ticket, he also gets a warning.

Sample Input 1
140

Sample Output 1
25000 License removed

Explanation 1
Since the driver has exceeded the speed limit, the formula is applied as follows:
(140-90).500=25000
In addition to the ticket, he will also get his license removed.

Sample Input 2
85

Sample Output 2
0 No punishment

Explanation 2
Since the driver has not exceeded the speed limit, he will not get any punishment.
*/
// Java 8
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

public class Solution {

    // Complete the solve function below.
    static void solve(int s) {
        int punishment=0;
        String warning="";
        if(s<=90){
           warning="No punishment"; 
        }
        else if(s>90 && s<=110){
            punishment=(s-90)*300;
            warning="Warning";
        }
        else{
            punishment=(s-90)*500;
            warning="License removed";
        }
        System.out.println(punishment+" "+warning);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(bufferedReader.readLine().trim());
        solve(s);
        bufferedReader.close();
    }
}