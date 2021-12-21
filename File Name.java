https://codeforces.com/problemset/problem/978/B


 import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	    
	       Scanner sc=new Scanner(System.in);
         int n=sc.nextInt(),c=0;
         String s=sc.next(),sub="xxx";
         for(int i=0;i<=s.length()-3;i++)
             if(s.substring(i,i+3).equals(sub)) c++;
         
         System.out.println(c);
         
	    }
        catch(Exception e) 	{ return; }
	}
}
