// Nestor was doing the work of his math class about three days but he is tired of make operations a lot and he should deliver his task tomorrow. His math’s teacher gives him two numbers a and b. The problem consist of finding the last digit of the potency of base a and index b. Help Nestor with his problem. You are given two integer numbers: the base a (0 <= a <= 20) and the index b (0 <= b <= 2,147,483,000), a and b both are not 0. You have to find the last digit of ab.

// Input
// The first line of input contains an integer t, the number of test cases (t <= 30). t test cases follow. For each test case will appear a and b separated by space.

// Output
// For each test case output an integer per line representing the result.

// Example
// Input:
// 2
// 3 10
// 6 2

// Output:
// 9
// 6

_________________________________________________________________________________________________________________________________________
import java.util.*;
class Main
{
    public static int power(int a,int b){
        int res=1;
        
         if(a%10==0) return 0;
         
         while(b>0){
             if(b%2!=0) res=(res*a)%10;
             b/=2;
             a=(a*a)%10;
         }
         return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	           Scanner sc=new Scanner(System.in);
	           int t=sc.nextInt();
	           while((t--)!=0)
	             {
	                int a=sc.nextInt(); 
	                 int b=sc.nextInt();
	              
	              System.out.println(power(a,b));
	         
	             }
	}
}
 
