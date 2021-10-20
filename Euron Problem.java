/*  Problem Statement:
Euron loves to arrange things in order. Euron sticks to his “Golden rule” that every set of numbers must be in ascending order. 
Unfortunately, that is not always the case. Euron defines a “violation” as a situation when a smaller number comes after a larger number in the set,
which violates the ascending order.

Given a set of integers, Euron needs to find out the total number of such violations.

Input:
The first line contains n, the number of integers.

 The second line contains n space separated integers a0 … an-1

Output:
The output is an integer indicating the total number of violations. 

Constraints:
0 < n <= 105

0 < ai < 108

Example  :
Input:

5

4 5 6 7 1

Output :

4

Explanation :

4, 5, 6 and 7 are in order.

1 comes after 4, 5, 6, 7 on the list, but is smaller than all 4 of them. Hence 4 is the answer.

 

Input :

5

5 4 3 2 1   */
_____________________________________________________________________________________________________________________________________________________________
import java.util.Scanner;

class EuraonProblem {

    static long divide(int a[], int lb, int ub) {
        long vio = 0;
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            vio += divide(a, lb, mid);
            vio += divide(a, mid + 1, ub);

            vio += merge(a, lb, mid, ub);
        }
     
        return vio;
    }

    static long merge(int a[], int l, int m, int r) {
        int vio = 0;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = a[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = a[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                vio += n1 - i;
                a[k] = R[j];
                j++;

            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }
        return vio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long vio = divide(a, 0, n - 1);
     
        System.out.println(vio);
        sc.close();
    }
}
