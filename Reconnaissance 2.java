https://codeforces.com/contest/34/problem/A



 import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	     int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int diff=Math.abs(arr[0]-arr[n-1]);
        int s1=0+1,s2=n-1+1;
        for(int i=0;i<n-1;i++) {
            if(Math.abs(arr[i]-arr[i+1]) < diff){
                s1=i+1;
                s2=i+1+1;
                diff=Math.abs(arr[i]-arr[i+1]);
            }
        }
        System.out.println(s1+" "+s2);
        	}
        catch(Exception e) 	{ return; }
	}
}
