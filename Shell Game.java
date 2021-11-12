// Today the «Z» city residents enjoy a shell game competition. The residents are gathered on the main square to watch the breath-taking performance. 
//   The performer puts 3 non-transparent cups upside down in a row. Then he openly puts a small ball under one of the cups and starts to shuffle the cups 
//   around very quickly so that on the whole he makes exactly 3 shuffles. After that the spectators have exactly one attempt to guess in which cup they think
//   the ball is and if the answer is correct they get a prize. Maybe you can try to find the ball too?

// Input
// The first input line contains an integer from 1 to 3 — index of the cup which covers the ball before the shuffles. The following three lines describe the shuffles. 
//     Each description of a shuffle contains two distinct integers from 1 to 3 — indexes of the cups which the performer shuffled this time. The cups are numbered from left to right and are renumbered after each shuffle from left to right again. In other words, the cup on the left always has index 1, the one in the middle — index 2 and the one on the right — index 3.

// Output
// In the first line output an integer from 1 to 3 — index of the cup which will have the ball after all the shuffles.

// Examples
// inputCopy
// 1
// 1 2
// 2 1
// 2 1
// outputCopy
// 2
// inputCopy
// 1
// 2 1
// 3 1
// 1 3
// outputCopy
// 2

_____________________________________________________________________________________________________________________________________________________________________
 import java.util.*;
// import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try {
	         int i,a,b,n;
		Scanner sc = new Scanner(new FileReader("input.txt"));
		PrintWriter pWriter = new PrintWriter (new FileWriter (new File ("output.txt")));
		n = sc.nextInt();
		for(i=0;i<3;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==n)
				n=b;
			else if(b==n)
				n=a;
		}
		pWriter.print(n);
		pWriter.close();
        	}
        catch(Exception e) 	{ return; }
	}
}
