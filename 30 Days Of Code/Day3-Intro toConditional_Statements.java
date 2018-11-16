/*
Day 3: Intro to Conditional Statements

Problem
Objective 
In this challenge, we're getting started with conditional statements. Check out the 
Tutorial tab for learning materials and an instructional video!

Task 
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 3 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format
A single line containing a positive integer,n.

Constraints
1<=n<=100

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0
3
Sample Output 0
Weird
Sample Input 1
24
Sample Output 1
Not Weird

Explanation
Sample Case 0: n=3 
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24 
 n>20 and n is even, so it isn't weird. Thus, we print Not Weird.
*/
// JAVA 7
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==0){
            if(N>=2 && N<=5){
                System.out.println("Not Weird");
            }
            else if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
        scanner.close();
    }
}