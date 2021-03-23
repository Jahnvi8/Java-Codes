package dp;

import java.util.*;

public class Min_coin_change {
  // min num of change coins needed
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount whose change is required");
		int n = sc.nextInt();
		int[] dp = new int[100];
		System.out.println("how many change coins are available??");
		int t=sc.nextInt();
		int[] coin_array=new int[t];
		System.out.println("enter array of coins");
		for (int i=0;i<t;i++)
		{coin_array[i]=sc.nextInt(); }
		int x = min_coin(n,coin_array,t,dp);
		System.out.println("ans = " + x);

	}
	public static int min_coin(int n,int[] coin_array,int t,int[] dp) {
		// base case
		if (n==0) return 0;
		
		// pre-available
		if(dp[n]!=0) return dp[n];
		
		//main logic
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<t;i++)
		{
			if(n-coin_array[i]>=0)
			{
				int sub=min_coin(n-coin_array[i],coin_array,t,dp);
				ans=Math.min(ans,sub+1);
				
			}
		}
		return dp[n]=ans;
			
		
	}

}
