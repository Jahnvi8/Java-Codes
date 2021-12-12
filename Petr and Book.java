
https://codeforces.com/problemset/problem/139/A



 import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int[] ar=new int[7];
	      
	      for(int i=0;i<7;i++)
	          ar[i]=sc.nextInt();
	          
	         int ind = 0;
             while(n>0){
              if(ind>=7) ind-=7;
               n-=ar[ind++];
            }
	      System.out.println(ind);
        	}
        catch(Exception e) 	{ return; }
	}
}
