
/****
 * Alex thinks some array is good if there exists some element that can be represented as the sum of all other elements (the sum of all other elements is 0
 if there are no other elements). For example, the array [1,6,3,2]
 is good since 1+3+2=6
. Furthermore, the array [0]
 is also good. However, the arrays [1,2,3,4]
 and [1]
 are not good.

Alex has an array a1,a2,…,an
. Help him count the number of good non-empty prefixes of the array a
. In other words, count the number of integers i
 (1≤i≤n
) such that the length i
 prefix (i.e. a1,a2,…,ai
) is good.

Input
The first line of the input contains a single integer t
 (1≤t≤104
) — the number of test cases.

The first line of each test case contains a single integer n
 (1≤n≤2⋅105
) — the number of elements in the array.

The second line of each test case contains n
 integers a1,a2,…,an
 (0≤ai≤109
) — the elements of the array.

It is guaranteed that the sum of n
 over all test cases does not exceed 2⋅105.
 */

import java.util.Scanner;
import java.util.Arrays;

class goodprefixes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();

      long[] arr = new long[n];
      for (int j = 0; j < n; j++) {
        arr[j] = sc.nextInt();
      }

      long result = good_prefixes(arr);
      System.out.println(result);
    }

    sc.close();
  }

  public static long good_prefixes(long[] arr) {
    int count = 0;

    for (int i = 0; i < arr.length; i++) {

      if (isgoodArray(Arrays.copyOfRange(arr, 0, i + 1))) {
        count++;
      }

    }
    return count;
  }

  public static boolean isgoodArray(long[] array) {
    long sum = 0;
    if (array.length == 1 && array[0] == 0) {
      return true;
    }
    long maxnum = max(array);
    for (long num : array) {
      sum += num;
    }
    return (sum == 2 * maxnum);
  }

  public static long max(long[] subarray) {
    long max = subarray[0];
    for (int i = 1; i < subarray.length; i++) {
      if (subarray[i] > max) {
        max = subarray[i];
      }
    }
    return max;
  }
}