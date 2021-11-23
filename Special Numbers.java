// Theofanis really likes sequences of positive integers, thus his teacher (Yeltsa Kcir) gave him a problem about a sequence that consists of only special numbers.

// Let's call a positive number special if it can be written as a sum of different non-negative powers of n. For example, for n=4 number 17 is special,
//   because it can be written as 40+42=1+16=17, but 9 is not.

// Theofanis asks you to help him find the k-th special number if they are sorted in increasing order. Since this number may be too large, output it modulo 109+7.

// Input
// The first line contains a single integer t (1≤t≤104) — the number of test cases.

// The first and only line of each test case contains two integers n and k (2≤n≤109; 1≤k≤109).

// Output
// For each test case, print one integer — the k-th special number in increasing order modulo 109+7.

// Example
// inputCopy
// 3
// 3 4
// 2 12
// 105 564
// outputCopy
// 9
// 12
// 3595374
// Note
// For n=3 the sequence is [1,3,4,9...]

________________________________________________________________________________________________________________________________________
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(t-->0){
            String[]s=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            long p=1;
            long ans=0;
            for(int i=0;i<32;i++){
                if((k&(1<<i))!=0){
                    ans=(ans+p)%1000000007;
                }
                p=(p*n)%1000000007;
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
}
