// One foggy Stockholm morning, Karlsson decided to snack on some jam in his friend Lillebror Svantenson's house. Fortunately for Karlsson, there wasn't anybody in his friend's 
//   house.
//   Karlsson was not going to be hungry any longer, so he decided to get some food in the house.

// Karlsson's gaze immediately fell on n wooden cupboards, standing in the kitchen. He immediately realized that these cupboards have hidden jam stocks. 
//   Karlsson began to fly greedily around the kitchen, opening and closing the cupboards' doors, grab and empty all the jars of jam that he could find.

// And now all jars of jam are empty, Karlsson has had enough and does not want to leave traces of his stay, so as not to let down his friend.
//   Each of the cupboards has two doors: the left one and the right one. Karlsson remembers that when he rushed to the kitchen, 
// all the cupboards' left doors were in the same position (open or closed), similarly, all the cupboards' right doors were in the same position (open or closed).
//   Karlsson wants the doors to meet this condition as well by the time the family returns. Karlsson does not remember the position of all the left doors, also, 
// he cannot remember the position of all the right doors. Therefore, it does not matter to him in what position will be all left or right doors. 
//   It is important to leave all the left doors in the same position, and all the right doors in the same position. For example, all the left doors may be closed,
// and all the right ones may be open.

// Karlsson needs one second to open or close a door of a cupboard. He understands that he has very little time before the family returns, so he wants to know the 
// minimum number of seconds t, in which he is able to bring all the cupboard doors in the required position.

// Your task is to write a program that will determine the required number of seconds t.

// Input
// The first input line contains a single integer n — the number of cupboards in the kitchen (2 ≤ n ≤ 104). Then follow n lines, each containing two integers
// li and ri (0 ≤ li, ri ≤ 1). Number li equals one, if the left door of the i-th cupboard is opened, otherwise number li equals zero. Similarly, number ri equals one,
// if the right door of the i-th cupboard is opened, otherwise number ri equals zero.

// The numbers in the lines are separated by single spaces.

// Output
// In the only output line print a single integer t — the minimum number of seconds Karlsson needs to change the doors of all cupboards to the position he needs.

// Examples
// inputCopy
// 5
// 0 1
// 1 0
// 0 1
// 1 1
// 0 1
// outputCopy
// 3

_____________________________________________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
// import java.io.*;

public class Main
{ 
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	           Scanner sc=new Scanner(System.in);
	            int t=sc.nextInt();
	            int temp=t;
	              int k1=0,k2=0;
	             int[] ar1=new int[temp];
	              int[] ar2=new int[temp];
	            while(t-->0){
	              
	              ar1[k1++]=sc.nextInt(); 
	              ar2[k2++]=sc.nextInt(); 
	             
	            }
	            int zero1=0,one1=0,time1=0;
	            for(int i=0;i<ar1.length;i++) {
	                if(ar1[i]==0) zero1++;
	                else one1++;
	            }
	            
	            if(zero1<=one1) time1=zero1;
	            else time1=one1;
	            
	             int zero2=0,one2=0,time2=0;
	            for(int i=0;i<ar2.length;i++) {
	                if(ar2[i]==0) zero2++;
	                else one2++;
	            }
	            
	            if(zero2<=one2) time2=zero2;
	            else time2=one2;
	            
	           System.out.println(time1+time2);
        	}
        catch(Exception e) 	{ return; }
	}
}
