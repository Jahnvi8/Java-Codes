https://codeforces.com/contest/450/problem/A


import java.util.*;
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
               Scanner sc=new Scanner(System.in);
	           int n=sc.nextInt(), m=sc.nextInt();
		       Queue<Integer> q=new LinkedList<>();
	        	int arr[]=new int[n];
	        	for(int i=0;i<n;i++) {
		        	arr[i]=sc.nextInt();
		         	q.add(i);
	       	}
		
	    	while(q.size()!=1) {
			int x=q.peek();
			if(arr[x]<=m) q.remove();
			else {
				int index=q.remove();
				arr[index]-=m;
				q.add(index);
			}
		}
		
		System.out.println(q.peek()+1);
	          
        	}
        catch(Exception e) 	{ return; }
	}
}
