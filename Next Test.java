// «Polygon» is a system which allows to create programming tasks in a simple and professional way.
//   When you add a test to the problem, the corresponding form asks you for the test index. As in most cases it is clear which index the next test will have, 
// the system suggests the default value of the index. It is calculated as the smallest positive integer which is not used as an index for some previously added test.

// You are to implement this feature. Create a program which determines the default index of the next test, given the indexes of the previously added tests.

// Input
// The first line contains one integer n (1 ≤ n ≤ 3000) — the amount of previously added tests. The second line contains n distinct integers a1, a2, ..., an (1 ≤ ai ≤ 3000)
//   — indexes of these tests.

// Output
// Output the required default value for the next test index.

// Examples
// inputCopy
// 3
// 1 7 2
// outputCopy
// 3

_________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
  
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	          int n=sc.nextInt(),ans=0;
	          ArrayList<Integer> al=new ArrayList<>();
	          for(int i=0;i<n;i++){
	              al.add(sc.nextInt());
	          }
	          
	         for(int i=1;i<=3020;i++)
	         {
	             if(!al.contains(i)){
	                 ans=i;
	                 break;
	             }
	         }
	         System.out.println(ans);
	    }
        catch(Exception e) 	{ return; }
	}
}

