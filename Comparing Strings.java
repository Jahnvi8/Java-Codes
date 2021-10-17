// Some dwarves that are finishing the StUDY (State University for Dwarven Youngsters) Bachelor courses, have been told "no genome, no degree". 
//   That means that all dwarves should write a thesis on genome. Dwarven genome is far from simple. It is represented by a string that consists of lowercase Latin letters.

// Dwarf Misha has already chosen the subject for his thesis: determining by two dwarven genomes, whether they belong to the same race. 
//   Two dwarves belong to the same race if we can swap two characters in the first dwarf's genome and get the second dwarf's genome as a result. 
//     Help Dwarf Misha and find out whether two gnomes belong to the same race or not.

// Input
// The first line contains the first dwarf's genome: a non-empty string, consisting of lowercase Latin letters.

// The second line contains the second dwarf's genome: a non-empty string, consisting of lowercase Latin letters.

// The number of letters in each genome doesn't exceed 105. It is guaranteed that the strings that correspond to the genomes are different. 
//     The given genomes may have different length.

// Output
// Print "YES", if the dwarves belong to the same race. Otherwise, print "NO".

// Examples
// inputCopy
// ab
// ba
// outputCopy
// YES
// inputCopy
// aa
// ab
// outputCopy
// NO
// Note
// First example: you can simply swap two letters in string "ab". So we get "ba".
// Second example: we can't change string "aa" into string "ab", because "aa" does not contain letter "b".

__________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
  
	           String s1=sc.next(),s2=sc.next();
	           int c=0;
	             char[] ar1=s1.toCharArray();
	           char[] ar2=s2.toCharArray();

	           if(s1.length()==s2.length()){
	                  Arrays.sort(ar1);
	                   Arrays.sort(ar2);
	               if(Arrays.equals(ar1, ar2)){
	                 for(int i=0;i<s1.length();i++)
	                     if(s1.charAt(i)!=s2.charAt(i)) c++;
                   }
                   if(c==2) System.out.println("YES");
                   else System.out.println("NO");
	           }
	           else  System.out.println("NO");
	           
	          
	       	}
        catch(Exception e) 	{ return; }
	}
}
