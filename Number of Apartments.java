// Recently a new building with a new layout was constructed in Monocarp's hometown. According to this new layout, the building consists of three types of apartments: 
//   three-room, five-room, and seven-room apartments. It's also known that each room of each apartment has exactly one window. 
//   In other words, a three-room apartment has three windows, a five-room — five windows, and a seven-room — seven windows.

// Monocarp went around the building and counted n windows. Now he is wondering, how many apartments of each type the building may have.

// Unfortunately, Monocarp only recently has learned to count, so he is asking you to help him to calculate the possible quantities of three-room, 
// five-room, and seven-room apartments in the building that has n windows. If there are multiple answers, you can print any of them.

// Here are some examples:

// if Monocarp has counted 30 windows, there could have been 2 three-room apartments, 2 five-room apartments and 2 seven-room apartments, since 2⋅3+2⋅5+2⋅7=30;
// if Monocarp has counted 67 windows, there could have been 7 three-room apartments, 5 five-room apartments and 3 seven-room apartments, since 7⋅3+5⋅5+3⋅7=67;
// if Monocarp has counted 4 windows, he should have mistaken since no building with the aforementioned layout can have 4 windows.
// Input
// Th first line contains one integer t (1≤t≤1000) — the number of test cases.

// The only line of each test case contains one integer n (1≤n≤1000) — the number of windows in the building.

// Output
// For each test case, if a building with the new layout and the given number of windows just can't exist, print −1.

// Otherwise, print three non-negative integers — the possible number of three-room, five-room, and seven-room apartments. If there are multiple answers, print any of them.

// Example
// inputCopy
// 4
// 30
// 67
// 4
// 14
// outputCopy
// 2 2 2
// 7 5 3
// -1
// 0 0 2
_______________________________________________________________________________________________________________________________________________
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
	            while(t-->0){
	                boolean flag=false;
	                int n=sc.nextInt();
	                for(int i=0;i<n;i++){
	                    for(int j=0;j<n;j++){
	                        int ans=3*i+5*j;
	                        if(ans<=n && (n-ans)%7==0){
	                            flag=true;
	                            System.out.println(i+" "+j+" "+(n-ans)/7);
	                            break;
	                        }
	                    }
	                    if(flag) break;
	                }
	                if(flag==false) System.out.println("-1");
	            }
	          
        	}
        catch(Exception e) 	{ return; }
	}
}