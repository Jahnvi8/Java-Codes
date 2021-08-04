// Problem
// You are given an integer  and your task is to make  a multiple of 3. In order to make  multiple of 3, you can insert at most one digit in .

// Your task is to find the minimum possible  which is a multiple of 3 after inserting at most one digit.

// Note: You can insert the digit anywhere in  and also you need not necessarily insert.

// Input format

// The first line contains an integer  denoting the number of test cases.
// The first line of each test case contains an integer .
// Output format

// For each test case:

// Print the minimum  which is a multiple of 3 after at most one insertion.
// Constraints

// Sample Input
// 1
// 5
// Sample Output
// 15
// Time Limit: 1
// Memory Limit: 256
// Source Limit:
// Explanation
// Self explainatory
________________________________________________________________________________________________________________________________________
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          while(t!=0){
             int n=sc.nextInt();
             int temp=n,sum=0;

             while(temp!=0){
                sum+=temp%10;
                temp/=10;
             }
             if(sum%3==0) System.out.println(n);
             else{
                int x=3-(n%3);
                long res=Long.MAX_VALUE;
               
                 Integer n1 = new Integer(n);
                StringBuffer s = new StringBuffer();
                 
                 s.append(n1);
               
                int len=s.length();
                for(int i=0;i<=len;i++){
                    StringBuffer s1 = new StringBuffer();
                    s1.append(s);
                    s1.insert(i,x);
                    String te=s1.toString();
                    long l=0;
                   try
                   {  l=Long.parseLong(te); 
                   } 
                   catch (NumberFormatException e)
                   {
                     l = 0;
                    }
                     res=Math.min(l,res);
                }
             System.out.println(res);
             }
              t--;
          }

    }
}
