// A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language appear in it at least once.
//   Pangrams are often used to demonstrate fonts in printing or test the output devices.

// You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. We say that the string 
// contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.

// Input
// The first line contains a single integer n (1 ≤ n ≤ 100) — the number of characters in the string.

// The second line contains the string. The string consists only of uppercase and lowercase Latin letters.

// Output
// Output "YES", if the string is a pangram and "NO" otherwise.

// Examples
// inputCopy
// 12
// toosmallword
// outputCopy
// NO
// inputCopy
// 35
// TheQuickBrownFoxJumpsOverTheLazyDog
// outputCopy
// YES

_____________________________________________________________________________________________________________________________________________________________
import java.util.*;
public class pangram {
	public static void main(String[] args) {
	    try{
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();
	s=s.toUpperCase();
	System.out.print(s.chars().distinct().count()>=26? "YES" : "NO");
}
catch(Exception e){return;}
	}

}
v
