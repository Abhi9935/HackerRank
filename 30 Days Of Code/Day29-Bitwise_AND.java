/*
Practice >> Tutorials >> 30 Days of Code >> Day 29: Bitwise AND
Day 29 : Bitwise AND

Problem
Objective 
Welcome to the last day! Today, we're discussing bitwise operations. Check out the Tutorial tab for learning materials and an instructional video!

Task 
Given set S={1,2,3,.....,N}. Find two integers, A and B (where A<B), from set S such that the value of A&B is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.

Input Format
The first line contains an integer, T, the number of test cases. 
Each of the T subsequent lines defines a test case as 2 space-separated integers, N and K, respectively.

Constraints
	1<=T<=10^3
	2<=N<=10^3
	2<=K<=N

Output Format
For each test case, print the maximum possible value of A&B on a new line.

Sample Input
3
5 2
8 5
2 2

Sample Output
1
4
0

Explanation
n=5,k=2, S={1,2,3,4,5}
All possible values of A and B are:
	A=1, B=2; A&B=0
	A=1, B=3; A&B=1
	A=1, B=4; A&B=0
	A=1, B=5; A&B=1
	A=2, B=3; A&B=2
	A=2, B=4; A&B=0
	A=2, B=5; A&B=0
	A=3, B=4; A&B=0
	A=3, B=5; A&B=1
	A=4, B=5; A&B=4
The maximum possible value of A&B that is also < (K=2) is 1, so we print 1 on a new line.
*/
// JAVA 8
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
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            if (((k-1) | k)>n && k%2== 0) {
                System.out.println(k-2);
            } else {
                System.out.println(k-1);
            }
        }
        scanner.close();
    }
}
