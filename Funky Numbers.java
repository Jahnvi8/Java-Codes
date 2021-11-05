// As you very well know, this year's funkiest numbers are so called triangular numbers (that is, integers that are representable as ,
//   where k is some positive integer), and the coolest numbers are those that are representable as a sum of two triangular numbers.

// A well-known hipster Andrew adores everything funky and cool but unfortunately, he isn't good at maths. Given number n, help him define whether
//   this number can be represented by a sum of two triangular numbers (not necessarily different)!

// Input
// The first input line contains an integer n (1 ≤ n ≤ 109).

// Output
// Print "YES" (without the quotes), if n can be represented as a sum of two triangular numbers, otherwise print "NO" (without the quotes).

// Examples
// inputCopy
// 256
// outputCopy
// YES
// inputCopy
// 512
// outputCopy
// NO
// Note
// In the first sample number .

// In the second sample number 512 can not be represented as a sum of two triangular numbers.


_________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	  
	       long n=sc.nextLong();
	       HashSet<Long> hm=new HashSet<>();
	       for(long i=1;i<100000;i++){
	           long a=(i*(i+1))/2;
	           hm.add(a);
	       }
	     
	       boolean flag=false;
	       for(Long i:hm){
	           if(hm.contains(n-i)) {
	               flag=true;
	               break;
	           }
	          
	       }
	       if(flag==true) System.out.println("YES");
	       else System.out.println("NO");
	     
        	}
        catch(Exception e) 	{ return; }
	}
}
