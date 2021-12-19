https://codeforces.com/contest/1618/problem/A


 import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	    
	       Scanner sc=new Scanner(System.in);
           int t = sc.nextInt(); 
	    	 while(t-->0) {
			int arr[] = new int[7];
			for(int i=0;i<7;i++) 
				arr[i] = sc.nextInt();
			
			int a1=arr[6]-arr[5];
			int a2=arr[6]-arr[4];
			int a3=arr[6]-a1-a2;
			System.out.println(a1+" "+a2+" "+a3);
		
		}
	    }
        catch(Exception e) 	{ return; }
	}
}
