https://codeforces.com/contest/205/problem/A


 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		
		int index=-1;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(ar[i]<min){
				min=ar[i];
				index=i;
			}
		}
		int occ=0;
		for(int i=0;i<n;i++)
			if(ar[i]==min)
				occ++;
			
		
		if(occ==1)
	    	System.out.println(index+1);
	    else
            System.out.println("Still Rozdil");
        	}
        catch(Exception e) 	{ return; }
	}
}
