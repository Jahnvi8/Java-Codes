package dp;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] dp=new int[100];
		int x= fib(n,dp);
		System.out.println("ans = "+x);

	}
	// return nth element in a fibonacci series
	 static int fib(int n,int[] dp)
	{    // base case
		if(n==0 || n==1)
			return n;
		// if n is already calcculated
		if(dp[n]!=0) return dp[n];
		
		int ans;
		ans=fib(n-1,dp)+fib(n-2,dp);
        return dp[n]=ans;		
	}

}
