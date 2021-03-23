package dp;

import java.util.*;

public class Min_steps_to_one {
// min num of change required to reach 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[100];
		int x = min_steps(n, dp);
		System.out.println("ans = " + x);
	}

	public static int min_steps(int n, int[] dp) {
		// base case
		if (n == 1)
			return 0;

		// if dp[n] is already calculated
		if (dp[n] != 0)
			return dp[n];

		// given conditions: n can be divided by 3 or 2 or can be reduced by 1
		int op1, op2, op3;
		op1 = Integer.MAX_VALUE;
		op2 = Integer.MAX_VALUE;
		op3 = Integer.MAX_VALUE;
		if (n % 3 == 0)
			op1 = min_steps(n / 3, dp);
		if (n % 2 == 0)
			op2 = min_steps(n / 2, dp);
		op3 = min_steps(n - 1, dp);

		int ans = Math.min(Math.min(op1, op2), op3) + 1;
		return dp[n] = ans;

	}

}
