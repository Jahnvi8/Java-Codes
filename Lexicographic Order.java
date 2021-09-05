// You are given two different strings S and T.
// If S is lexicographically smaller than T, print Yes; otherwise, print No.

// What is the lexicographical order?
// Note that many major programming languages implement lexicographical comparison of strings as operators or functions in standard libraries.
//   For more detail, see your language's reference.

// Constraints
// S and T are different strings, each of which consists of lowercase English letters and has a length of between 1 and 10 (inclusive).
// Input
// Input is given from Standard Input in the following format:

// S T
// Output
// If S is lexicographically smaller than T, print Yes; otherwise, print No.

// Sample Input 1 
// Copy
// abc atcoder
// Sample Output 1 
// Copy
// Yes
// abc and atcoder begin with the same character, but their second characters are different. Since b comes earlier than t in alphabetical order, 
// we can see that abc is lexicographically smaller than atcoder.

// Sample Input 2 
// Copy
// arc agc
// Sample Output 2 
// Copy
// No
// Sample Input 3 
// Copy
// a aa
// Sample Output 3 
// Copy
// Yes
_______________________________________________________________________________________________________________________________________________________
import java.util.*;
public class Main  {
   
    public static void main(String args[] ) throws Exception {
      
       Scanner sc = new Scanner(System.in);
        String one=sc.next();
        String two=sc.next();
        int val=one.compareTo(two);
       if(val<0) System.out.println("Yes");
       else System.out.println("No");
       }
}
