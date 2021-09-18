// Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

// Note, that during capitalization all the letters except the first one remains unchanged.

// Input
// A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.

// Output
// Output the given word after capitalization.

// Examples
// inputCopy
// ApPLe
// outputCopy
// ApPLe
// inputCopy
// konjac
// outputCopy
// Konjac
______________________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            String name=sc.next();
	            String firstLetStr = name.substring(0, 1);
       
                String remLetStr = name.substring(1);
 
      
                firstLetStr = firstLetStr.toUpperCase();
 
     
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        System.out.println(firstLetterCapitalizedName);
        	}
        catch(Exception e) 	{ return; }
        
	}
}
