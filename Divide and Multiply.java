// William has array of n numbers a1,a2,…,an. He can perform the following sequence of operations any number of times:

// Pick any two items from array ai and aj, where ai must be a multiple of 2
// ai=ai2
// aj=aj⋅2
// Help William find the maximal sum of array elements, which he can get by performing the sequence of operations described above.

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤104). Description of the test cases follows.

// The first line of each test case contains an integer n (1≤n≤15), the number of elements in William's array.

// The second line contains n integers a1,a2,…,an (1≤ai<16), the contents of William's array.

// Output
// For each test case output the maximal sum of array elements after performing an optimal sequence of operations.

// Example
// inputCopy
// 5
// 3
// 6 4 2
// 5
// 1 2 3 4 5
// 1
// 10
// 3
// 2 3 4
// 15
// 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8
// outputCopy
// 50
// 46
// 10
// 26
// 35184372088846
// Note
// In the first example test case the optimal sequence would be:

// Pick i=2 and j=1. After performing a sequence of operations a2=42=2 and a1=6⋅2=12, making the array look as: [12, 2, 2].
// Pick i=2 and j=1. After performing a sequence of operations a2=22=1 and a1=12⋅2=24, making the array look as: [24, 1, 2].
// Pick i=3 and j=1. After performing a sequence of operations a3=22=1 and a1=24⋅2=48, making the array look as: [48, 1, 1].
// The final answer 48+1+1=50.

// In the third example test case there is no way to change the sum of elements, so the answer is 10
___________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
    
    public static long check(int[] ar,int largest){
        int c=0;long sum=0;
        for(int i=0;i<ar.length;i++){
            if(i!=largest){
                int z=ar[i];
                while(z%2==0){
                    z/=2;
                    c++;
                }
                sum+=z;
            }
            
        }
        long var=ar[largest];
        var*=Math.pow(2,c);
        return var+sum;
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            int t=sc.nextInt();
	            while(t-->0){
	             int n=sc.nextInt();
	             int[] ar=new int[n];
	             for(int i=0;i<n;i++)
	                 ar[i]=sc.nextInt();
	                 long ans=-1;
	                
	             for(int i=0;i<n;i++){
	                 int largest=i;
	                 long x= check(ar,largest);
	                 ans=Math.max(x,ans);
	             }
	             
	              System.out.println(ans);
	            }
        	}
        catch(Exception e) 	{ return; }
	}
}
