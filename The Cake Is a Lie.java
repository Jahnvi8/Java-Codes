https://codeforces.com/problemset/problem/1519/B


 import java.util.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	    
	       Scanner sc=new Scanner(System.in);
           int t = sc.nextInt(); 
	    	 while(t-->0) {
		    int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
		    if((n*m-1)==k) System.out.println("YES");
		    else System.out.println("NO");
		
		}
	    }
        catch(Exception e) 	{ return; }
	}
}
