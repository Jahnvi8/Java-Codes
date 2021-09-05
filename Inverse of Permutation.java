// Problem Statement
// We will call a sequence of length N where each of 1,2,…,N occurs once as a permutation of length N.
// Given a permutation of length N, P=(p 
// 1
// ​
//  ,p 
// 2
// ​
//  ,…,p 
// N
// ​
//  ), print a permutation of length N, Q=(q 
// 1
// ​
//  ,…,q 
// N
// ​
//  ), that satisfies the following condition.

// For every i (1≤i≤N), the p 
// i
// ​
//  -th element of Q is i.
// It can be proved that there exists a unique Q that satisfies the condition.

// Constraints
// 1≤N≤2×10 
// 5
 
// (p 
// 1
// ​
//  ,p 
// 2
// ​
//  ,…,p 
// N
// ​
//  ) is a permutation of length N (defined in Problem Statement).
// All values in input are integers.
// Input
// Input is given from Standard Input in the following format:

// N
// p 
// 1
// ​
//   p 
// 2
// ​
//   … p 
// N
// ​
 
// Output
// Print the sequence Q in one line, with spaces in between.

// q 
// 1
// ​
//   q 
// 2
// ​
//   … q 
// N
// ​
 
// Sample Input 1 
// Copy
// 3
// 2 3 1
// Sample Output 1 
// Copy
// 3 1 2
// The permutation Q=(3,1,2) satisfies the condition, as follows.

// For i=1, we have p 
// i
// ​
//  =2,q 
// 2
// ​
//  =1.
// For i=2, we have p 
// i
// ​
//  =3,q 
// 3
// ​
//  =2.
// For i=3, we have p 
// i
// ​
//  =1,q 
// 1
// ​
//  =3.
// Sample Input 2 
// Copy
// 3
// 1 2 3
// Sample Output 2 
// Copy
// 1 2 3
// If p 
// i
// ​
//  =i for every i (1≤i≤N), we will have P=Q.

// Sample Input 3 
// Copy
// 5
// 5 3 2 4 1
// Sample Output 3 
// Copy
// 5 3 2 4 1
_________________________________________________________________________________________________________________________________________________
import java.util.*;
public class Main  {
   
    public static void main(String args[] ) throws Exception {
      
       Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n+1];
        
      for(int i=1;i<ar.length;i++)
        ar[i]=sc.nextInt();
      
      int[] res=new int[n+1];
      for(int i=1;i<ar.length;i++){
         res[ar[i]]=i;
      }
      for(int i=1;i<res.length;i++)
       System.out.print(res[i]+" ");
         
         
       }
}
