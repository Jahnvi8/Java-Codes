https://codeforces.com/contest/1618/problem/C



import java.util.*;
import java.lang.*;
import java.io.*;


public class Codechef
{
    static long gcd(long a, long b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long[]arr=new long[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextLong();
		    long min1=arr[0],min2=arr[1];
		    for(int i=0;i<n;i+=2)
		        min1=gcd(arr[i],min1);
		    for(int i=1;i<n;i+=2)
		        min2=gcd(arr[i],min2);
		    boolean try1=true,try2=true;
		    for(int i=0;i<n;i++){
		        if(i%2==0 && arr[i]%min1!=0){
		            try1=false;
		            break;
		        }
		        if(i%2!=0 && arr[i]%min1==0){
		            try1=false;
		            break;
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(i%2==0 && arr[i]%min2==0){
		            try2=false;
		            break;
		        }
		        else if(i%2!=0 && arr[i]%min2!=0){
		            try2=false;
		            break;
		        }
		    }
		    long ans=0;
		    if(try1)ans=min1;
		    else if(try2)ans=min2;
		    
		    
		    System.out.println(ans);
		    
		}
	}
}
