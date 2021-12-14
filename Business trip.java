https://codeforces.com/contest/149/problem/A


 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	        int k=sc.nextInt();
    	int[] ar=new int[12];
    	int sum=0,c=0;
    	for(int i=0;i<12;i++)
    		ar[i]=sc.nextInt();
    	Arrays.sort(ar);
    	for(int i=11;i>=0;i--)
    	 {  if(sum>=k)
        	break;
         	c=c+1;
    		sum+=ar[i];
    	
     }
    	if(sum<k)
    		System.out.println(-1);
    	else
    	System.out.println(c);
        	}
        catch(Exception e) 	{ return; }
	}
}
