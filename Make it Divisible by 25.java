// It is given a positive integer n. In 1 move, one can select any single digit and remove it (i.e. one selects some position in the number and removes the digit located at this position). The operation cannot be performed if only one digit remains. If the resulting number contains leading zeroes, they are automatically removed.

// E.g. if one removes from the number 32925 the 3-rd digit, the resulting number will be 3225. If one removes from the number 20099050 the first digit, the resulting number will be 99050 (the 2 zeroes going next to the first digit are automatically removed).

// What is the minimum number of steps to get a number such that it is divisible by 25 and positive? It is guaranteed that, for each n occurring in the input, the answer exists. It is guaranteed that the number n has no leading zeros.

// Input
// The first line contains one integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

// Each test case consists of one line containing one integer n (25≤n≤1018). It is guaranteed that, for each n occurring in the input, the answer exists. It is guaranteed that the number n has no leading zeros.

// Output
// For each test case output on a separate line an integer k (k≥0) — the minimum number of steps to get a number such that it is divisible by 25 and positive.

// Example
// inputCopy
// 5
// 100
// 71345
// 3259
// 50555
// 2050047
// outputCopy
// 0
// 3
// 1
// 3
// 2
// Note
// In the first test case, it is already given a number divisible by 25.

// In the second test case, we can remove the digits 1, 3, and 4 to get the number 75.

// In the third test case, it's enough to remove the last digit to get the number 325.

// In the fourth test case, we can remove the three last digits to get the number 50.

// In the fifth test case, it's enough to remove the digits 4 and 7.
________________________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
    public static int change(int n){
        return Integer.valueOf(Integer.toString(n).replace("0", ""));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	            while(t-->0){
	              String str=sc.next();
	              int c1=0,c2=0,d1=Integer.MAX_VALUE,d2=Integer.MAX_VALUE;
	              boolean flag1=true,flag2=true;
	              for(int i=str.length()-1;i>=0;i--){
	                  if(flag1==true){
	                  if(str.charAt(i)=='0'){
	                      for(int j=i-1;j>=0;j--){
	                          if(str.charAt(j)=='0' || str.charAt(j)=='5'){
	                             d1=c1;
	                             flag1=false;
	                              break;
	                          }
	                          else c1++;
	                      }
	                  }
	                  else c1++;
	                  }
	                  if(flag2==true){
	                   if(str.charAt(i)=='5'){
	                      for(int j=i-1;j>=0;j--){
	                          if(str.charAt(j)=='2' || str.charAt(j)=='7'){
	                              d2=c2;
	                              flag2=false;
	                              break;
	                          }
	                          else c2++;
	                      }
	                      
	                  }
	                  else c2++;
	              }
	                  
	              }
	               System.out.println((int)Math.min(d1,d2));   
	              }
	       	}
        catch(Exception e) 	{ return; }
	}
}
