// Lord Omkar would like to have a tree with n nodes (3≤n≤105) and has asked his disciples to construct the tree. However, Lord Omkar has created m (1≤m<n) restrictions to ensure that the tree will be as heavenly as possible.

// A tree with n nodes is an connected undirected graph with n nodes and n−1 edges. Note that for any two nodes, there is exactly one simple path between them, where a simple path is a path between two nodes that does not contain any node more than once.

// Here is an example of a tree:


// A restriction consists of 3 pairwise distinct integers, a, b, and c (1≤a,b,c≤n). It signifies that node b cannot lie on the simple path between node a and node c.

// Can you help Lord Omkar and become his most trusted disciple? You will need to find heavenly trees for multiple sets of restrictions. It can be shown that a heavenly tree will always exist for any set of restrictions under the given constraints.

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤104). Description of the test cases follows.

// The first line of each test case contains two integers, n and m (3≤n≤105, 1≤m<n), representing the size of the tree and the number of restrictions.

// The i-th of the next m lines contains three integers ai, bi, ci (1≤ai,bi,ci≤n, a, b, c are distinct), signifying that node bi cannot lie on the simple path between nodes ai and ci.

// It is guaranteed that the sum of n across all test cases will not exceed 105.

// Output
// For each test case, output n−1 lines representing the n−1 edges in the tree. On each line, output two integers u and v (1≤u,v≤n, u≠v) signifying that there is an edge between nodes u and v. Given edges have to form a tree that satisfies Omkar's restrictions.

// Example
// inputCopy
// 2
// 7 4
// 1 2 3
// 3 4 5
// 5 6 7
// 6 5 4
// 5 3
// 1 2 3
// 2 3 4
// 3 4 5
// outputCopy
// 1 2
// 1 3
// 3 5
// 3 4
// 2 7
// 7 6
// 5 1
// 1 3
// 3 2
// 2 4
// Note
// The output of the first sample case corresponds to the following tree:


___________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	            while(t-->0){
	             int n=sc.nextInt();
	             int m=sc.nextInt();
	             
	             Set<Integer> s=new HashSet<>();
	             for(int i=1;i<=n;i++) s.add(i);
	
	             for(int i=0;i<m;i++){
	                 int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	                 s.remove(new Integer(b));
	                 
	             }
	             int x=s.iterator().next();
	             for(int i=1;i<=n;i++){
	                 if(x==i) continue;
	                 else System.out.println(x+" "+i);
	             }
	              }
	       	}
        catch(Exception e) 	{ return; }
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	            while(t-->0){
	             int n=sc.nextInt();
	             int m=sc.nextInt();
	             
	             Set<Integer> s=new HashSet<>();
	             for(int i=1;i<=n;i++) s.add(i);
	
	             for(int i=0;i<m;i++){
	                 int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	                 s.remove(new Integer(b));
	                 
	             }
	             int x=s.iterator().next();
	             for(int i=1;i<=n;i++){
	                 if(x==i) continue;
	                 else System.out.println(x+" "+i);
	             }
	              }
	       	}
        catch(Exception e) 	{ return; }
	}
}
