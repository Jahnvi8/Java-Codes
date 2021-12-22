https://codeforces.com/problemset/problem/363/B


 import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	    
	       Scanner sc=new Scanner(System.in);
         int n = sc.nextInt(),k=sc.nextInt();
        int []dp = new int[n+1];
        for(int i=1;i<=n;i++)
            dp[i] = dp[i-1]+sc.nextInt();
        int min=Integer.MAX_VALUE,ans=0;
        for(int i=k;i<=n;i++){
            if(dp[i]-dp[i-k]<min){
                min=dp[i]-dp[i-k];
                ans=i-k+1;
            }
        }
        System.out.println(ans);
         
	    }
        catch(Exception e) 	{ return; }
	}
}
