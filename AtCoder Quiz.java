// AtCoder currently holds four series of regular contests: ABC, ARC, AGC, and AHC.

// What is the series of regular contests currently held by AtCoder in addition to S 
// 1
// ​
//  , S 
// 2
// ​
//  , and S 
// 3
// ​
//  ?

// Constraints
// Each of S 
// 1
// ​
//  , S 
// 2
// ​
//  , and S 
// 3
// ​
//   is ABC, ARC, AGC, or AHC.
// S 
// 1
// ​
//  , S 
// 2
// ​
//  , and S 
// 3
// ​
//   are pairwise different.
// Input
// Input is given from Standard Input in the following format:

// S 
// 1
// ​
 
// S 
// 2
// ​
 
// S 
// 3
// ​
 
// Output
// Print the answer.

// Sample Input 1 
// Copy
// ARC
// AGC
// AHC
// Sample Output 1 
// Copy
// ABC
// Given in input are ARC, AGC, and AHC. The rest is ABC.

// Sample Input 2 
// Copy
// AGC
// ABC
// ARC
// Sample Output 2 
// Copy
// AHC
_______________________________________________________________________________________________________________________________________________________
import java.util.*;

 
public class Main  {
   
    public static void main(String args[] ) throws Exception {
      
       Scanner sc = new Scanner(System.in);

       Set<String> set=new HashSet<>();
      for(int i=0;i<3;i++)
       set.add(sc.next());
      
      if(!set.contains("ABC")) 
       System.out.println("ABC");
         
        if(!set.contains("AGC"))
       System.out.println("AGC");
           
           if(!set.contains("AHC")) 
       System.out.println("AHC");
              
              if(!set.contains("ARC")) 
       System.out.println("ARC");
         
         
       }
}
