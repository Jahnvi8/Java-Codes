https://codeforces.com/contest/352/problem/A



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
		int f=0,z=0;
		for(int i=0;i<n;i++) {
			int k = sc.nextInt();
			if(k==5)
				f++;
			
			else if(k==0)
				z++;
			
		}
		if(z==0)
			System.out.println(-1);
		
		else if(f<9) 
			System.out.println(0);	
		
		else{
			f-=(f%9);
			for(int i=0;i<f;i++) 
				System.out.print("5");	
			
			for(int i=0;i<z;i++) 
				System.out.print("0");	
			
		}
	    }
        catch(Exception e) 	{ return; }
	}
}
