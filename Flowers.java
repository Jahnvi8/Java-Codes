
// We saw the little game Marmot made for Mole's lunch. Now it's Marmot's dinner time and, as we all know, Marmot eats flowers. 
//   At every dinner he eats some red and white flowers. Therefore a dinner can be represented as a sequence of several flowers, some of them white and some of them red.

// But, for a dinner to be tasty, there is a rule: Marmot wants to eat white flowers only in groups of size k.

// Now Marmot wonders in how many ways he can eat between a and b flowers. As the number of ways could be very large, print it modulo 1000000007 (109 + 7).

// Input
// Input contains several test cases.

// The first line contains two integers t and k (1 ≤ t, k ≤ 105), where t represents the number of test cases.

// The next t lines contain two integers ai and bi (1 ≤ ai ≤ bi ≤ 105), describing the i-th test.

// Output
// Print t lines to the standard output. The i-th line should contain the number of ways in which Marmot can eat between ai and bi flowers at dinner modulo 1000000007 (109 + 7).

// Examples
// inputCopy
// 3 2
// 1 3
// 2 3
// 4 4
// outputCopy
// 6
// 5
// 5
// Note
// For K = 2 and length 1 Marmot can eat (R).
// For K = 2 and length 2 Marmot can eat (RR) and (WW).
// For K = 2 and length 3 Marmot can eat (RRR), (RWW) and (WWR).
// For K = 2 and length 4 Marmot can eat, for example, (WWWW) or (RWWR), but for example he can't eat (WWWR).

____________________________________________________________________________________________________________________________________________________
import java.util.*;
public class Main {
    static int N=100001;
    static  int mod=1000000007;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t,k;
        t=sc.nextInt();
        k=sc.nextInt();
        int dp[]=new int[N];
        dp[0]=1;
        for(int i=1;i<N;i++){
            dp[i]+=dp[i-1];
            if(i-k>=0) dp[i]+=dp[i-k];
            if(dp[i]>=mod) dp[i]-=mod;
        }
        dp[0]=0;
        for(int i=1;i<N;i++){
            dp[i]+=dp[i-1];
            if(dp[i]>=mod) dp[i]-=mod;
        }
        while(t-- >0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            System.out.println((dp[r]-dp[l-1]+mod)%mod);
        }

    }
}
