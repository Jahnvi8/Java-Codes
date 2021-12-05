// Objective
// In this challenge, we practice calculating the mean, median, and mode. Check out the Tutorial tab for learning materials and an instructional video!

// Task
// Given an array, , of  integers, calculate and print the respective mean, median, and mode on separate lines. If your array contains more than one modal value, 
// choose the numerically smallest one.

// Note: Other than the modal value (which will always be an integer), your answers should be in decimal form, rounded to a scale of  decimal place (i.e., ,  format).

// Example


// The mean is .
// The median is .
// The mode is  because  occurs most frequently.

// Input Format

// The first line contains an integer, , the number of elements in the array.
// The second line contains  space-separated integers that describe the array's elements.

// Constraints

// , where  is the  element of the array.
// Output Format

// Print  lines of output in the following order:

// Print the mean on the first line to a scale of  decimal place (i.e., , ).
// Print the median on a new line, to a scale of  decimal place (i.e., , ).
// Print the mode on a new line. If more than one such value exists, print the numerically smallest one.
// Sample Input

// 10
// 64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
// Sample Output

// 43900.6
// 44627.5
// 4978
// Explanation

// Mean:
// We sum all  elements in the array, divide the sum by , and print our result on a new line.

// Median:
// To calculate the median, we need the elements of the array to be sorted in either non-increasing or non-decreasing order. The sorted array . 
// We then average the two middle elements:

// and print our result on a new line.
// Mode:
// We can find the number of occurrences of all the elements in the array:

//  4978 : 1
// 11735 : 1
// 14216 : 1
// 14470 : 1
// 38120 : 1
// 51135 : 1
// 64630 : 1
// 67060 : 1
// 73429 : 1
// 99233 : 1
// Every number occurs once, making  the maximum number of occurrences for any number in . Because we have multiple values to choose from, we want to select the smallest one, ,
// and print it on a new line.
_____________________________________________________________________________________________________________________________________________________________
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            int num = sc.nextInt();
            arr[i] = num;
            sum += num;
        }
        double mean = (double) sum / n;
        Arrays.sort(arr);
        double median;
        if(n % 2 == 0)
        {
            median = (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }
        else
        {
            median = arr[n / 2];
        }
        int maxCount = 1;
        int count = 1;
        int current = arr[0];
        int mode = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == current)
            {
                count++;
            }
            else
            {
                count = 1;
                current = arr[i];
            }
            
            if(count > maxCount)
            {
                maxCount = count;
                mode = current;
            }
        }
        System.out.printf("%.1f\n%.1f\n%d", mean, median, mode);
    }
}
