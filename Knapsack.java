// Given an array of integers and a target sum, determine the sum nearest to but not exceeding the target that can be created. To create the sum, use any element of your array zero or more times.

// For example, if  and your target sum is , you might select  or . In this case, you can arrive at exactly the target.

// Function Description

// Complete the unboundedKnapsack function in the editor below. It must return an integer that represents the sum nearest to without exceeding the target value.

// unboundedKnapsack has the following parameter(s):

// k: an integer
// arr: an array of integers
// Input Format

// The first line contains an integer , the number of test cases.

// Each of the next  pairs of lines are as follows:
// - The first line contains two integers  and , the length of  and the target sum.
// - The second line contains  space separated integers .

// Constraints



// Output Format

// Print the maximum sum for each test case which is as near as possible, but not exceeding, to the target sum on a separate line.

// Sample Input

// 2
// 3 12
// 1 6 9
// 5 9
// 3 4 4 4 8
// Sample Output

// 12
// 9
// Explanation

// In the first test case, one can pick {6, 6}. In the second, we can pick {3,3,3}.
_____________________________________________________________________________________________________________________________________
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] weights = new int[n];
            boolean[] sack = new boolean[k+1];
            for(int j=0; j<n; j++){
                weights[j] = sc.nextInt();
                if(weights[j] < k+1)sack[weights[j]] = true;
            }
            
            for(int j=0; j<k+1; j++){
                for(int p=0; p<n; p++){
                    if(sack[j])break;
                    if(j - weights[p] > 0 && sack[j - weights[p]]){
                        sack[j] = true;
                    }
                }
            }
            print(sack);
        }
    }
    
    public static void print(boolean[] sack){
        for(int i=sack.length-1; i>=0; i--){
            if(sack[i]){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
