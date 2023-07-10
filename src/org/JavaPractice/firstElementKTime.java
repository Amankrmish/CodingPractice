package org.JavaPractice;
import java.util.HashMap;
import java.util.Map;

public class firstElementKTime {

  public static int firstElementKTime(int[] a, int n, int k) {
    /*
    Finds the first element that occurs at least K number of times in the array A.

    Args:
      A: The array of integers.
      N: The size of the array.
      K: The minimum number of times an element must occur.

    Returns:
      The index of the first element that occurs at least K number of times, or -1 if
      no such element exists.
    */

    Map<Integer, Integer> count = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int value = count.getOrDefault(a[i], 0);
      Integer put = count.put(a[i], value + 1);
    }

    for (int i = 0; i < n; i++) {
      if (count.get(a[i]) >= k) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] A = {1, 7, 4, 3, 4, 8, 7};
    int N = 7;
    int K = 2;

    int index = firstElementKTime(A, N, K);

    System.out.println(index);
  }
}
