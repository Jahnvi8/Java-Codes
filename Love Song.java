// Petya once wrote a sad love song and shared it to Vasya. The song is a string consisting of lowercase English letters.
// Vasya made up q questions about this song. Each question is about a subsegment of the song starting from the l-th letter to the r-th letter.
//   Vasya considers a substring made up from characters on this segment and repeats each letter in the subsegment k times,
// where k is the index of the corresponding letter in the alphabet. For example, if the question is about the substring "abbcb", then Vasya repeats letter 'a' once,
// each of the letters 'b' twice, letter 'c" three times, so that the resulting string is "abbbbcccbb", its length is 10.
//   Vasya is interested about the length of the resulting string.

// Help Petya find the length of each string obtained by Vasya.

// Input
// The first line contains two integers n and q (1≤n≤100000, 1≤q≤100000) — the length of the song and the number of questions.

// The second line contains one string s — the song, consisting of n lowercase letters of English letters.

// Vasya's questions are contained in the next q lines. Each line contains two integers l and r (1≤l≤r≤n) — the bounds of the question.

// Output
// Print q lines: for each question print the length of the string obtained by Vasya.

// Examples
// inputCopy
// 7 3
// abacaba
// 1 3
// 2 5
// 1 7
// outputCopy
// 4
// 7
// 11
// inputCopy
// 7 4
// abbabaa
// 1 3
// 5 7
// 6 6
// 2 4
// outputCopy
// 5
// 4
// 1
// 5
// inputCopy
// 13 7
// sonoshikumiwo
// 1 5
// 2 10
// 7 7
// 1 13
// 4 8
// 2 5
// 3 9
// outputCopy
// 82
// 125
// 9
// 191
// 62
// 63
// 97
// Note
// In the first example Vasya is interested in three questions. In the first question Vasya considers the substring "aba",
// that transforms to "abba", so the answer is equal to 4. In the second question Vasya considers "baca", that transforms to "bbaccca", so the answer is 7.
//   In the third question Vasya considers the string "abacaba",that transforms to "abbacccabba" of length 11.
____________________________________________________________________________________________________________________________________________________

import java.util.Scanner;
import java.util.*;


public class TestClass  {
   
    public static void main(String args[] ) throws Exception {
       try {
        Scanner sc = new Scanner(System.in);

	    long n=sc.nextLong();
	    long q=sc.nextLong();
	   //   sc.nextLine();
	    String s=sc.next();
	  int[] ar=new int[s.length()+1];
	  ar[1]=(s.charAt(0)-'a')+1;
	  for(int i=1;i<s.length();i++){
	      int cval=(s.charAt(i)-'a')+1;
	      ar[i+1]=cval+ar[i];
	      
	  }

	    while(q!=0){
	        int l=sc.nextInt();
	        int u=sc.nextInt();
	       
	        
	        
	        if(l==1)  System.out.println(ar[u]);
	        else{
	            
	            System.out.println(ar[u]-ar[l-1]);
	        }
	               q--;
	          }
	  } catch(Exception e) {return;
	  } 
        }
       
        }


