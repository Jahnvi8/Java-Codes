package dp;

import java.util.Scanner;

// return length of lcs
public class LCS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		int m = a.length;
		int n = b.length;

		give_lcs(a, b, m, n);
	}

	public static void give_lcs(char[] a, char[] b, int m, int n) {
// find length

// naive approach (2^n time)
//		if (m == 0 || n == 0)
//			return 0;
//		if (a[m - 1] == b[n - 1])
//			return 1 + give_lcs(a, b, m - 1, n - 1);
//		else
//			return Math.max(give_lcs(a, b, m, n - 1), give_lcs(a, b, m, n - 1));

// DP approach (mn time: length of both strings)
		int mat[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					mat[i][j] = 0;
				else if (a[i - 1] == b[j - 1])
					mat[i][j] = mat[i - 1][j - 1] + 1;
				else {
					mat[i][j] = Math.max(mat[i - 1][j], mat[i][j - 1]);

				}

			}
		}
		System.out.println("length of lcs is " + mat[m][n]);

// printing the lcs
		int index = mat[m][n];
		int temp = index;
		char[] lcs = new char[index + 1];
		lcs[index] = '\u0000';
		int i = m;
		int j = n;
		while (i > 0 && j > 0) {
			if (a[i - 1] == b[j - 1]) {
				lcs[index - 1] = a[i - 1];
				i--;
				j--;
				index--;
			} else if (mat[i - 1][j] > mat[i][j - 1])
				i--;
			else {
				j--;
			}
		}
		System.out.println("lcs is ");
		for (int k = 0; k <= temp; k++)
			System.out.print(lcs[k]);
	}

}
