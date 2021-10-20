// AquaMoon has n friends. They stand in a row from left to right, and the i-th friend from the left wears a T-shirt with a number ai written on it.
// Each friend has a direction (left or right). In the beginning, the direction of each friend is right.

// AquaMoon can make some operations on friends. On each operation, AquaMoon can choose two adjacent friends and swap their positions.
// After each operation, the direction of both chosen friends will also be flipped: left to right and vice versa.

// AquaMoon hopes that after some operations, the numbers written on the T-shirt of n friends in the row, read from left to right, become non-decreasing. 
// Also she wants, that all friends will have a direction of right at the end. Please find if it is possible.

// Input
// The input consists of multiple test cases. The first line contains a single integer t (1≤t≤50) — the number of test cases.

// The first line of each test case contains a single integer n (1≤n≤105) — the number of Aquamoon's friends.

// The second line contains n integers a1,a2,…,an (1≤ai≤105) — the numbers, written on the T-shirts.

// It is guaranteed that the sum of n for all test cases does not exceed 105.

// Output
// For each test case, if there exists a possible sequence of operations, print "YES" (without quotes); otherwise, print "NO" (without quotes).

// You can print each letter in any case (upper or lower).

// Example
// inputCopy
// 3
// 4
// 4 3 2 5
// 4
// 3 3 2 2
// 5
// 1 2 3 5 4
// outputCopy
// YES
// YES
// NO
// Note
// The possible list of operations in the first test case:

// Swap a1 and a2. The resulting sequence is 3,4,2,5. The directions are: left, left, right, right.
// Swap a2 and a3. The resulting sequence is 3,2,4,5. The directions are: left, left, right, right.
// Swap a1 and a2. The resulting sequence is 2,3,4,5. The directions are: right, right, right, right.

________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	            while(t-->0){
	             int n=sc.nextInt();
	             int ar[]=new int[n];
	             int dp[][]=new int[2][100005+1];
	             for(int i=0;i<n;i++){
	                 ar[i]=sc.nextInt();
	                 if((i&1)==1) dp[0][ar[i]]++;
	                 else dp[1][ar[i]]++;
	                 
	             }
	             Arrays.sort(ar);
	             for(int i=0;i<n;i++){
	                 
	                 if((i&1)==1) dp[0][ar[i]]--;
	                 else dp[1][ar[i]]--;
	                 
	             }
	             boolean flag=true;
	             for(int i=0;i<2;i++){
	                 for(int j=0;j<dp[i].length;j++){
	                     if(dp[i][j]!=0) {
	                         flag=false;
	                     break;}
	                 }
	             }
	             if(flag==false) System.out.println("NO");
	             else System.out.println("YES");
	             
	              }
	       	}
        catch(Exception e) 	{ return; }
	}
}

