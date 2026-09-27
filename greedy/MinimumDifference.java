package greedy;

import java.util.Arrays;

public class MinimumDifference {
  public static int minDiff(int arr[], int n) {
    Arrays.sort(arr);

    int minDiff = 0;
    for (int i = 0, j = 1; i < n; i += 2, j += 2) {
      minDiff += Math.abs(arr[i] - arr[j]);
    }

    return minDiff;
  }

  public static void main(String[] args) {
    int arr[] = { 12, 5, 25, 10, 2, 15, 8, 30 };
    int n = arr.length;

    int res = minDiff(arr, n);
    System.out.println("MINIMUM DIFFERENCE: " + res);
  }
}
