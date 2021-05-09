// We define the following:

// A subarray of an n-element array is an array composed from a contiguous block of the original array's elements.
// The sum of an array is the total sum of its elements.
// An array's sum is negative if the total sum of its elements is negative.
// An array's sum is positive if the total sum of its elements is positive.
// Given an array of  integers, find and print its number of negative subarrays on a new line.

// Input Format
// The first line contains a single integer,n , denoting the length of array A .
// The second line contains n  space-separated integers describing each respective element in array .
// Output Format
// Print the number of subarrays of A having negative sums.
  
// Sample Input
// 5
// 1 -2 4 -5 1
// Sample Output
// 9
______________________________________________________________________________________________________________________________________________________
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        ar[i]=sc.nextInt();
        
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=ar[j];
                if(sum<0) c++;
            }
        }
        System.out.println(c);
        
    }
}
