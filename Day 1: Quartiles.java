// https://www.hackerrank.com/challenges/s10-quartiles/problem?isFullScreen=false


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i ++) {
            numbers[i] = s.nextInt();
        }
        Arrays.sort(numbers);
        int Q2Val = findMedianHelper(numbers, 0, numbers.length - 1);
        int Q1Val = findMedianHelper(numbers, 0, numbers.length / 2 - 1);
        int Q3Val = findMedianHelper(numbers, numbers.length % 2 == 0 ? numbers.length / 2 : numbers.length / 2 + 1, numbers.length - 1);
        

        System.out.format("%d\n%d\n%d\n", Q1Val, Q2Val, Q3Val);
    }
    
    public static int findMedianHelper(int[] array, int lo, int hi) {
        return (
                array[(lo + hi) / 2] +
                array[(lo + hi + 1) / 2]
                )  / 2;
    }
}
