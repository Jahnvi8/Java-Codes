// One day, Ahmed_Hossam went to Hemose and said "Let's solve a gym contest!". Hemose didn't want to do that, as he was playing Valorant,
//   so he came up with a problem and told it to Ahmed to distract him. Sadly, Ahmed can't solve it... Could you help him?

// There is an Agent in Valorant, and he has n weapons. The i-th weapon has a damage value ai, and the Agent will face an enemy whose health value is H.

// The Agent will perform one or more moves until the enemy dies.

// In one move, he will choose a weapon and decrease the enemy's health by its damage value. The enemy will die when his health will become less than or equal to 0. 
//   However, not everything is so easy: the Agent can't choose the same weapon for 2 times in a row.

// What is the minimum number of times that the Agent will need to use the weapons to kill the enemy?

// Input
// Each test contains multiple test cases. The first line contains the number of test cases t (1≤t≤105). Description of the test cases follows.

// The first line of each test case contains two integers n and H (2≤n≤103,1≤H≤109) — the number of available weapons and the initial health value of the enemy.

// The second line of each test case contains n integers a1,a2,…,an (1≤ai≤109) — the damage values of the weapons.

// It's guaranteed that the sum of n over all test cases doesn't exceed 2⋅105.

// Output
// For each test case, print a single integer — the minimum number of times that the Agent will have to use the weapons to kill the enemy.

// Example
// inputCopy
// 3
// 2 4
// 3 7
// 2 6
// 4 2
// 3 11
// 2 1 7
// outputCopy
// 1
// 2
// 3
// Note
// In the first test case, the Agent can use the second weapon, making health value of the enemy equal to 4−7=−3. −3≤0, so the enemy is dead, and using weapon 1 time was enough.

// In the second test case, the Agent can use the first weapon first, and then the second one. After this, the health of enemy will drop to 6−4−2=0,
// meaning he would be killed after using weapons 2 times.

// In the third test case, the Agent can use the weapons in order (third, first, third), decreasing the health value of enemy to 11−7−2−7=−5 after using the weapons 3 times. 
//   Note that we can't kill the enemy by using the third weapon twice, as even though 11−7−7<0, it's not allowed to use the same weapon twice in a row.



____________________________________________________________________________________________________________________________________________________________
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{ 
  
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	 
	           Scanner sc=new Scanner(System.in);
	           
	            int t=sc.nextInt();
	           
	            while(t-->0){
	              int n=sc.nextInt(),h=sc.nextInt(),ar[]=new int[n];
	              for(int i=0;i<n;i++) ar[i]=sc.nextInt();
	              Arrays.sort(ar);
	              long a=ar[n-1],b=ar[n-2];
	               if(a>=h || b>=h) System.out.println("1");
                   else if(a==1 && b==1) System.out.println(h);
                   else
                    {       
                        long y=(h/(a+b));
                           if(y==0) System.out.println("2");
                           else
                              {
                                if(h%(a+b)==0) System.out.println(y*2);
                                else
                                 {  long res=(h%(a+b));
                                    if(res>a) System.out.println((y*2)+2);
                                    else System.out.println((y*2)+1);
                             
                                 }
                             }
	               }
	    }
	    }
        catch(Exception e) 	{ return; }
	}
}

