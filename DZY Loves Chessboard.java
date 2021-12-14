
https://codeforces.com/contest/445/problem/A

 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	    
		int n=sc.nextInt(),
		m=sc.nextInt();
		char arr[][]=new char[n][m];
		char b[][]=new char[n][m];
		
		for(int i=0;i<n;i++) 
			arr[i]=sc.next().toCharArray();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if((i+j)%2==0)
					b[i][j]='B';
				else
					b[i][j]='W';
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) 
				if(arr[i][j]=='-')
					b[i][j]='-';
			
		}
		
			
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) 
				System.out.print(b[i][j]);
			
			System.out.println();
		}
	    }
        catch(Exception e) 	{ return; }
	}
}
