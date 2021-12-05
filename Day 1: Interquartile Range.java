https://www.hackerrank.com/challenges/s10-interquartile-range/problem?isFullScreen=false



import java.io.*;
import java.util.*;

public class Solution {

    private static double computeMean(int[] x) {
        if (x.length % 2 == 0) {
            return (x[x.length / 2] + x[(x.length / 2) - 1] + 0.0) / 2;    
        }
        else {
            return x[x.length / 2] + 0.0;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] x = new int[n];
        int[] f = new int[n];
        
        for (int i = 0; i < n; ++i) {
            x[i] = scanner.nextInt();
        }
        
        int l = 0;
        for (int i = 0; i < n; ++i) {
            f[i] = scanner.nextInt();
            l += f[i];
        }
        
        int[] s = new int[l];
        int k = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < f[i]; ++j, ++k) {
                s[k] = x[i];
            }
        }
        
        Arrays.sort(s);
        double Q1 = 0, Q3 = 0;
        
        if (l % 2 == 0) {
            Q1 = computeMean(Arrays.copyOfRange(s, 0, l / 2));
            Q3 = computeMean(Arrays.copyOfRange(s, l / 2, l));
        }
        else {
            Q1 = computeMean(Arrays.copyOfRange(s, 0, l / 2));
            Q3 = computeMean(Arrays.copyOfRange(s, (l / 2) + 1, l));
        }
        
        System.out.printf("%.1f\n", (Q3 - Q1));
    }
}
