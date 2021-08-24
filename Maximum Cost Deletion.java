// You are given a string s of length n consisting only of the characters 0 and 1.

// You perform the following operation until the string becomes empty: choose some consecutive substring of equal characters, erase it from the string and glue the remaining two parts together (any of them can be empty) in the same order. For example, if you erase the substring 111 from the string 111110, you will get the string 110. When you delete a substring of length l, you get a⋅l+b points.

// Your task is to calculate the maximum number of points that you can score in total, if you have to make the given string empty.

// Input
// The first line contains a single integer t (1≤t≤2000) — the number of testcases.

// The first line of each testcase contains three integers n, a and b (1≤n≤100;−100≤a,b≤100) — the length of the string s and the parameters a and b.

// The second line contains the string s. The string s consists only of the characters 0 and 1.

// Output
// For each testcase, print a single integer — the maximum number of points that you can score.

// Example
// inputCopy
// 3
// 3 2 0
// 000
// 5 -2 5
// 11001
// 6 1 -4
// 100111
// outputCopy
// 6
// 15
// -2
// Note
// In the first example, it is enough to delete the entire string, then we will get 2⋅3+0=6 points.

// In the second example, if we delete characters one by one, then for each deleted character we will get (−2)⋅1+5=3 points, i. e. 15 points in total.

// In the third example, we can delete the substring 00 from the string 100111, we get 1⋅2+(−4)=−2 points, and the string will be equal to 1111, removing it entirely we get 1⋅4+(−4)=0 points. In total, we got −2 points for 2 operations.

_____________________________________________________________________________________________________________________________________________________________
import java.util.*;

public class Main {
    
    public static int cse(String str,char ch, int a,int b){
        int cost=0,count=0,sec_count=0;
        for(int i=0;i<str.length();i++)
        {
            if(i+1<str.length() && str.charAt(i)==ch && str.charAt(i+1)==ch)
              count++;
              
            else
            {
                if(str.charAt(i)==ch)
                cost+=((a*(count+1))+b);
                
                count=0;
            }  
            if(str.charAt(i)!=ch) sec_count++;
                
            
        }
        cost+=((a*sec_count))+b;
        return cost;
    }
    
	public static void main(String[] args)
	{
       try{ 
           
           Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while((t--)!=0){
               int l=sc.nextInt();
               int a=sc.nextInt();
               int b=sc.nextInt();
               
               String str=sc.next();
               int min=Integer.MAX_VALUE;
               int max=Integer.MIN_VALUE;
               
               if(b>=0){
                   System.out.println((a*1+b)*l);
               }
               else{
                    System.out.println((int)Math.max(cse(str,'0',a,b),cse(str,'1',a,b)));
                }
              }
           }
          
	
	    	catch(Exception e){return;}
	}


}
