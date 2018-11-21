/*
RECode 4.0 >> Misa's Love

Misa's Love 

Problem
Misa Amane loves Light Yagami and she wants to join him in his mission to wipe out all criminals.
However, Light Yagami is skeptical about her intelligence and asks her to prove it.

He gives Misa a string consisting of lowercase english characters and asks her to count the
occurrence of the non-empty prefix which occurs maximum number of times in the string as substring. 
Misa cannot solve it and has asked for your help. Solve this task for her!

Input Format
The first and only line of input contains the string as defined in statement.

Constraints
	1<=length of string<=100
It is guaranteed that the given string contains only lowercase english alphabets

Output Format
In a single line print the count of the prefix which occurs maximum number of times.

Sample Input 0
abc
Sample Output 0
1
Sample Input 1
abbcdabbcd
Sample Output 1
2
*/
// Java 8
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        int count=1;
        for(int i=1; i<l;i++){
           if(s.charAt(0)==s.charAt(i)){
            count=count+1;          
           }
        }
        System.out.println(count);
    }
}