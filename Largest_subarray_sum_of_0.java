package gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Largest_subarray_sum_of_0 {

	public static int sum_0(int[] arr) {
		Map<Integer, Integer> map = new HashMap();

		for (int i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];

		int max_length = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0)
				max_length = Math.max(max_length, i + 1);

			if (map.containsKey(arr[i]))
				max_length = Math.max(max_length, i - map.getOrDefault(arr[i], 500));

			else
				map.put(arr[i], i);

		}

		return max_length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num and elements of array");
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int ans = sum_0(ar);
		System.out.println(ans);

	}

}
