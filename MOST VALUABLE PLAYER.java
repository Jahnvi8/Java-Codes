// You host a PUBG Game. Killing an enemy gives you 50 points, reviving your teammate gives you 100 points, assisting a kill gives 30 points,
// and gathering loot gives 10 points. given the event table of a player in form of an array of events finds the MVP for the game.

// Input Format
// The first line of input contains N, the Number of players that joined your server.
// The 2N subsequent lines contain the name and event table for each player on the map.
// Output Format
// Print name of the player with the highest score, Assume no two players will have the same score.

// Constraints
// 1≤N≤100
// 1≤EventSize≤100
// Sample Input 1 
// 3
// Batman
// LOOT KILL REVIVE LOOT LOOT LOOT KILL KILL ASSIST REVIVE
// Superman
// LOOT ASSIST ASSIST ASSIST ASSIST ASSIST ASSIST ASSIST
// Flash
// LOOT KILL KILL KILL KILL KILL KILL KILL KILL
// Sample Output 1 
// Batman
// Explanation
// Batman has 2 revives, 1 assist, 3 kills and 4 loots, batman's score is 200 + 30 + 150 + 40 with a total of 420 Superman has 1 loot and 7 assist superman's
// score is 10 + 210 with a total of 220 Flash has 1 loot and 8 kills, the score is 10 + 400 with a total of 410

// Batman has the highest score and is MVP of the game.


_______________________________________________________________________________________________________________________________________
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   sc.nextLine();
	  
	   Map<Integer, String> hm = 
               new TreeMap<Integer, String>(Collections.reverseOrder());
	   while(n!=0){
	       String s1=sc.nextLine();
	       String s2=sc.nextLine();
	       String[] ar=s2.split(" ");
	       int sum=0;
	       
	       for(int i=0;i<ar.length;i++)
	    {
	        if(ar[i].equals("LOOT")) sum+=10;
	       else if(ar[i].equals("KILL")) sum+=50;
	       else if(ar[i].equals("ASSIST")) sum+=30;
	       else if(ar[i].equals("REVIVE")) sum+=100;
	    }
	    hm.put(sum,s1);
	     
	       n--;
	   }
	    for (Map.Entry mapElement : hm.entrySet()) {
	        System.out.println(mapElement.getValue());
	        break;
	    }
	        
	}
}
