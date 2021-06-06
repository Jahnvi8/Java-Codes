/*  Write a function to check whether two given strings are anagram of each other or not.
An anagram of a string is another string that contains the same characters, only the order  of characters can be different. 
return true if s1 is an anagram of s2, and false otherwise.
 
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 
Constraints:
1 <= s.length, t.length <= 5 * 104
s1 and s2 consist of lowercase English letters.   */


import java.util.Scanner;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1,s2));
        
        }
        
     public boolean isAnagram(String s1, String s2) {
        
         int[] ar1=new int[256];
        int[] ar2=new int[256];
        boolean ana=true;
        if(s1.length()!=s2.length()) return false;
        if(s1.length()==s2.length())
        {
        	for(char c:s1.toCharArray())
        	{
        		int index=(int) c;
        		ar1[index]++;
        	}
        	for(char c:s2.toCharArray())
        	{
        		int index=(int) c;
        		ar2[index]++;
        	}
        }
        for(int i=0;i<256;i++)
        {
        	if(ar1[i] != ar2[i])  
        	{
        		ana=false;
        		break;
        	}
        }
        if(ana) return true;
        else return false;
    }
    }
 
