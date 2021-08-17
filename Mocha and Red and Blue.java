// As their story unravels, a timeless tale is told once again...

// Shirahime, a friend of Mocha's, is keen on playing the music game Arcaea and sharing Mocha interesting puzzles to solve. 
//   This day, Shirahime comes up with a new simple puzzle and wants Mocha to solve them.
//   However, these puzzles are too easy for Mocha to solve, so she wants you to solve them and tell her the answers. The puzzles are described as follow.

// There are n squares arranged in a row, and each of them can be painted either red or blue.
// Among these squares, some of them have been painted already, and the others are blank. You can decide which color to paint on each blank square.
// Some pairs of adjacent squares may have the same color, which is imperfect. We define the imperfectness as the number of pairs of adjacent squares that share the same color.

// For example, the imperfectness of "BRRRBBR" is 3, with "BB" occurred once and "RR" occurred twice.
// Your goal is to minimize the imperfectness and print out the colors of the squares after painting.
// Input
// Each test contains multiple test cases.

// The first line contains a single integer t (1≤t≤100) — the number of test cases. Each test case consists of two lines.

// The first line of each test case contains an integer n (1≤n≤100) — the length of the squares row.

// The second line of each test case contains a string s with length n, containing characters 'B', 'R' and '?'.
//     Here 'B' stands for a blue square, 'R' for a red square, and '?' for a blank square.

// Output
// For each test case, print a line with a string only containing 'B' and 'R', the colors of the squares after painting, which imperfectness is minimized. 
//       If there are multiple solutions, print any of them.

// Example
// inputCopy
// 5
// 7
// ?R???BR
// 7
// ???R???
// 1
// ?
// 1
// B
// 10
// ?R??RB??B?
// outputCopy
// BRRBRBR
// BRBRBRB
// B
// B
// BRRBRBBRBR
// Note
// In the first test case, if the squares are painted "BRRBRBR", the imperfectness is 1 (since squares 2 and 3 have the same color), which is the minimum possible imperfectness.
_________________________________________________________________________________________________________________________________________________________________________
import java.util.*;

public class Main
{
    
    public static String convert(String str,char temp){
           char ch;
           int n=str.length();
           
           for(int i=0;i<n;i++)
       {    
           if(str.charAt(i)=='?' && i-1>=0 )
            {    ch=str.charAt(i-1);
                 if(ch!='?')
                 {
                    if(ch=='R')
                    str = str.substring(0, i) + 'B' + str.substring(i+ 1);
                    else if(ch=='B')
                    str = str.substring(0, i) + 'R' + str.substring(i+ 1);
                 }
            }  
            
             else if(str.charAt(i)=='?' && i+1<n && str.charAt(i+1)!='?')
                {   ch=str.charAt(i+1);
                        if(ch=='R')
                        str = str.substring(0, i) + 'B' + str.substring(i+ 1);
                        else if(ch=='B')
                        str = str.substring(0, i) + 'R' + str.substring(i+ 1);
                        
                }
             else if(str.charAt(i)=='?') {
                         str = str.substring(0, i) + temp + str.substring(i+ 1);
                }
      
    }
    return str;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	           int t=sc.nextInt();
	           while((t--)!=0)
	             {
	               int n=sc.nextInt();
	               String s=sc.next();
	               String ans="";
	               String ans1="";
	               
	               ans=convert(s,'B');
	               ans1=convert(s,'R');
	               
	               int cnt=0,cnt1=0;
                    for(int i=0;i<n-1;i++)
                   {
                       if(ans.charAt(i)==ans.charAt(i+1))
                         cnt++;
                       if(ans1.charAt(i)==ans1.charAt(i+1))
                         cnt1++;
                    }
                    if(cnt1<cnt)
                     System.out.println(ans1);
                     else
                     System.out.println(ans);
	              
	             }
	         }
	      catch(Exception e) 	{ return; }
	        
        	
      
        
	}
}

