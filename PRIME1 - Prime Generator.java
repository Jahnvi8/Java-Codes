// Peter wants to generate some prime numbers for his cryptosystem. Help him! Your task is to generate all prime numbers between two given numbers!

// Input
// The input begins with the number t of test cases in a single line (t<=10). In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

// Output
// For every test case print all prime numbers p such that m <= p <= n, one number per line, test cases separated by an empty line.

// Example
// Input:
// 2
// 1 10
// 3 5

// Output:
// 2
// 3
// 5
// 7

// 3
// 5
// Warning: large Input/Output data, be careful with certain languages (though most should be OK if the algorithm is well designed)
// Information
// After cluster change, please consider PRINT as a more challenging problem.

____________________________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    
    public static Boolean isPrime(int n){
        
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2)
            if(n%i==0) return false;
        
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	           int t=sc.nextInt();
	           while((t--)!=0)
	             {
	                int a=sc.nextInt();
	                int b=sc.nextInt();
	                
	                for(int i=a;i<=b;i++){
	                    if(isPrime(i)) 
	                     System.out.println(i);
	                }
	                System.out.println();
	                }
	               
	            
	         
	             }
	               catch(Exception e) 	{ return; }
	        
        	
      
        
	}
}
