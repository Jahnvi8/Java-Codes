// A burglar got into a matches warehouse and wants to steal as many matches as possible. In the warehouse there are m containers, 
// in the i-th container there are ai matchboxes, and each matchbox contains bi matches. All the matchboxes are of the same size. 
// The burglar's rucksack can hold n matchboxes exactly. Your task is to find out the maximum amount of matches that a burglar can carry away. 
// He has no time to rearrange matches in the matchboxes, that's why he just chooses not more than n matchboxes so that the total amount of matches in them is maximal.

// Input
// The first line of the input contains integer n (1 ≤ n ≤ 2·108) and integer m (1 ≤ m ≤ 20). The i + 1-th line contains a pair of numbers ai and bi 
// (1 ≤ ai ≤ 108, 1 ≤ bi ≤ 10). All the input numbers are integer.

// Output
// Output the only number — answer to the problem.

// Examples
// inputCopy
// 7 3
// 5 10
// 2 5
// 3 6
// outputCopy
// 62
// inputCopy
// 3 3
// 1 3
// 2 2
// 3 1
// outputCopy
// 7

_____________________________________________________________________________________________________________________________________________

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a,t,n=sc.nextInt(),m=sc.nextInt();
         int ar[][]=new int[m][2];
         long re=0;
       for(t=0;t<m;t++){
           ar[t][0]=sc.nextInt();
           ar[t][1]=sc.nextInt();
       }
        java.util.Arrays.sort(ar, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) { return Double.compare(a[1],b[1] ); }});

       for(t=m-1;t>=0&&n>0;t--){
          if(n>=ar[t][0]) a=ar[t][0];else a=n;
           re+=a*ar[t][1];
           n-=a;
       }
       System.out.print(re);
    }}
