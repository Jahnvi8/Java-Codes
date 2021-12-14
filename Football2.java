https://codeforces.com/problemset/problem/43/A


 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	     Scanner sc=new Scanner(System.in);
	       HashMap<String,Integer> hm=new HashMap<>();
	       int n=sc.nextInt();
	       for(int i=0;i<n;i++){
	           String s=sc.next();
	           hm.put(s,hm.getOrDefault(s,0)+1);
	       }
	       
	       int maxValueInMap = (Collections.max(hm.values()));
           for (Map.Entry<String, Integer> entry : hm.entrySet()) 
            if (entry.getValue() == maxValueInMap)
                System.out.println(entry.getKey());
           
        	}
        catch(Exception e) 	{ return; }
	}
}
