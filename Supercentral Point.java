https://codeforces.com/problemset/problem/165/A


 import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
		int n,i,j,c=0;
		n=sc.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for (i=0;i<n;i++)
		{
		    x[i]=sc.nextInt();
		    y[i]=sc.nextInt();
		}
		for (i=0;i<n;i++)
		{
		    boolean u=false,d=false,l=false,r=false;
		    for (j=0;j<n;j++)
		    {
		        if (x[i]>x[j] && y[i]==y[j]) r=true;
		        if (x[i]<x[j] && y[i]==y[j]) l=true;
		        if (x[i]==x[j] && y[i]<y[j]) d=true;
		        if (x[i]==x[j] && y[i]>y[j]) u=true;
		    }
		    if(r && l && d && u)
		    c++;
		}
		System.out.println(c);
        	}
        catch(Exception e) 	{ return; }
	}
}
