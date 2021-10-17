/*   Problem Statement
Takahashi's purse has one or more 100-yen coins in it and nothing else. (Yen is the Japanese currency.)

Is it possible that the total amount of money in the purse is X yen?

Constraints
0≤X≤1000
All values in input are integers.
Input
Input is given from Standard Input in the following format:

X
Output
If it is possible that the total amount of money in Takahashi's purse is X yen, print Yes; otherwise, print No.

Sample Input 1 
Copy
500
Sample Output 1 
Copy
Yes
If the purse has five 100-yen coins, the total amount of money is 500 yen. Thus, it is possible that the total amount is X=500 yen, so we should print Yes.

Sample Input 2 
Copy
40
Sample Output 2 
Copy
No
Sample Input 3 
Copy
0
Sample Output 3 
Copy
No
Note that the purse has at least one 100-yen coin.   */


_______________________________________________________________________________________________________________________________________________________________
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    if(x == 0 || x % 100 != 0) System.out.println("No");
    else System.out.println("Yes");
  }
}
