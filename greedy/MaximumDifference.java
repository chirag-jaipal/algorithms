package greedy;

import java.util.Arrays;

public class MaximumDifference {
  public static int maxDiff(int arr[], int n) {
    Arrays.sort(arr);

    int maxDiff = 0;
    for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
      maxDiff += Math.abs(arr[i] - arr[j]);
    }

    return maxDiff;
  }

  public static void main(String[] args) {
    int arr[] = { 12, 5, 25, 10, 2, 15, 8, 30 };
    int n = arr.length;

    int res = maxDiff(arr, n);
    System.out.println("MAXIMUM DIFFERENCE: " + res);
  }
}
