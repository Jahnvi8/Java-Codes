https://codeforces.com/contest/224/problem/A



 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	     float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		
		double length=Math.sqrt((a*c)/b);
		double width=a/length;
		double height=c/length;
		System.out.println((long)(length*4+width*4+height*4));
        	}
        catch(Exception e) 	{ return; }
	}
}
