// You are given a keyboard that consists of 26 keys. The keys are arranged sequentially in one row in a certain order. Each key corresponds to a unique lowercase Latin letter.

// You have to type the word s on this keyboard. It also consists only of lowercase Latin letters.

// To type a word, you need to type all its letters consecutively one by one. To type each letter you must position your hand exactly over the corresponding key and press it.

// Moving the hand between the keys takes time which is equal to the absolute value of the difference between positions of these keys (the keys are numbered from left to right). No time is spent on pressing the keys and on placing your hand over the first letter of the word.

// For example, consider a keyboard where the letters from 'a' to 'z' are arranged in consecutive alphabetical order. The letters 'h', 'e', 'l' and 'o' then are on the positions 8, 5, 12 and 15, respectively. Therefore, it will take |5−8|+|12−5|+|12−12|+|15−12|=13 units of time to type the word "hello".

// Determine how long it will take to print the word s.

// Input
// The first line contains an integer t (1≤t≤1000) — the number of test cases.

// The next 2t lines contain descriptions of the test cases.

// The first line of a description contains a keyboard — a string of length 26, which consists only of lowercase Latin letters. 
//   Each of the letters from 'a' to 'z' appears exactly once on the keyboard.

// The second line of the description contains the word s. The word has a length from 1 to 50 letters inclusive and consists of lowercase Latin letters.

// Output
// Print t lines, each line containing the answer to the corresponding test case. The answer to the test case is the minimal time it takes to type the word
// s on the given keyboard.

// Example
// inputCopy
// 5
// abcdefghijklmnopqrstuvwxyz
// hello
// abcdefghijklmnopqrstuvwxyz
// i
// abcdefghijklmnopqrstuvwxyz
// codeforces
// qwertyuiopasdfghjklzxcvbnm
// qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
// qwertyuiopasdfghjklzxcvbnm
// abacaba
// outputCopy
// 13
// 0
// 68
// 0
// 74
__________________________________________________________________________________________________________________________________________________________
 import java.util.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            int t=sc.nextInt();
	        while(t-->0){
	        int diff=0,sum=0;
	        String s=sc.next(),word=sc.next();
	        HashMap<Character,Integer> hm=new HashMap<>();
	        for(int i=0;i<26;i++)
	        {
	            char ch=s.charAt(i);
	            hm.put(ch,i+1);
	        }
	      
	        for(int i=0;i<word.length()-1;i++){
	             diff=Math.abs(hm.get(word.charAt(i))-hm.get(word.charAt(i+1)));
	             sum+=diff;
	        }
	        System.out.println(sum);
	        }
        	}
        catch(Exception e) 	{ return; }
	}
}
