// Problem Statement
// You are given a tree with N vertices and N−1 edges.
// The vertices are numbered 1,2,…,N. The i-th edge connects Vertex a 
// i
// ​
//   and Vertex b 
// i
// ​
//  .

// Determine whether this tree is a star.

// Here, a star is a tree where there is a vertex directly connected to all other vertices.

// Notes
// For the definition of a tree, see Tree (graph theory) - Wikipedia.

// Constraints
// 3≤N≤10 
// 5
 
// 1≤a 
// i
// ​
//  <b 
// i
// ​
//  ≤N
// The given graph is a tree.
// Input
// Input is given from Standard Input in the following format:

// N
// a 
// 1
// ​
//   b 
// 1
// ​
 
// ⋮
// a 
// N−1
// ​
//   b 
// N−1
// ​
 
// Output
// If the given graph is a star, print Yes; otherwise, print No.

// Sample Input 1 
// Copy
// 5
// 1 4
// 2 4
// 3 4
// 4 5
// Sample Output 1 
// Copy
// Yes
// The given graph is a star.

// Sample Input 2 
// Copy
// 4
// 2 4
// 1 4
// 2 3
// Sample Output 2 
// Copy
// No
// The given graph is not a star.

// Sample Input 3 
// Copy
// 10
// 9 10
// 3 10
// 4 10
// 8 10
// 1 10
// 2 10
// 7 10
// 6 10
// 5 10
// Sample Output 3 
// Copy
// Yes
_________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	        
	      
	           Scanner sc=new Scanner(System.in);
	           
	           // int t=sc.nextInt();
	           int n=sc.nextInt();
	           n-=1;
	           int temp=n;
	           HashMap<Integer,Integer> hm=new HashMap<>();
	         
	            while(n-->0){
	               int a=sc.nextInt();
	               hm.put(a,hm.getOrDefault(a,0)+1);
	                int b=sc.nextInt();
	               hm.put(b,hm.getOrDefault(b,0)+1);
	          
	            }
	          
	            int flag=0;
	             for (Map.Entry mapElement : hm.entrySet()) {
                   int value = ((int)mapElement.getValue());
                   if(value==temp){
                       System.out.println("Yes");
                       flag++;
                       break;
                   }
	             }
	             if(flag==0) System.out.println("No");
        	}
        catch(Exception e) 	{ return; }
	}
}
