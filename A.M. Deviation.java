// A number a2 is said to be the arithmetic mean of two numbers a1 and a3, if the following condition holds: a1+a3=2⋅a2.

// We define an arithmetic mean deviation of three numbers a1, a2 and a3 as follows: d(a1,a2,a3)=|a1+a3−2⋅a2|.

// Arithmetic means a lot to Jeevan. He has three numbers a1, a2 and a3 and he wants to minimize the arithmetic mean deviation d(a1,a2,a3). 
// To do so, he can perform the following operation any number of times (possibly zero):

// Choose i,j from {1,2,3} such that i≠j and increment ai by 1 and decrement aj by 1
// Help Jeevan find out the minimum value of d(a1,a2,a3) that can be obtained after applying the operation any number of times.

// Input
// The first line contains a single integer t (1≤t≤5000)  — the number of test cases.

// The first and only line of each test case contains three integers a1, a2 and a3 (1≤a1,a2,a3≤108).

// Output
// For each test case, output the minimum value of d(a1,a2,a3) that can be obtained after applying the operation any number of times.

// Example
// inputCopy
// 3
// 3 4 5
// 2 2 6
// 1 6 5
// outputCopy
// 0
// 1
// 0
// Note
// Note that after applying a few operations, the values of a1, a2 and a3 may become negative.

// In the first test case, 4 is already the Arithmetic Mean of 3 and 5.

// d(3,4,5)=|3+5−2⋅4|=0
// In the second test case, we can apply the following operation:

// (2,2,6) −→−−−−−−increment a2decrement a1 (1,3,6)
// d(1,3,6)=|1+6−2⋅3|=1
// It can be proven that answer can not be improved any further.

// In the third test case, we can apply the following operations:

// (1,6,5) −→−−−−−−increment a3decrement a2 (1,5,6) −→−−−−−−increment a1decrement a2 (2,4,6)
// d(2,4,6)=|2+6−2⋅4|=0


_____________________________________________________________________________________________________________________________________
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a, b, c;
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			System.out.println(Math.abs((a + c - (2 * b))) % 3 == 0 ? 0 : 1);
		}
	}
}
