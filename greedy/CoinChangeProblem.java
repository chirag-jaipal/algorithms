package greedy;

import java.util.Arrays;

public class CoinChangeProblem {
  public static int minimumDenominations(int arr[], int amt) {
    Arrays.sort(arr);
    int n = arr.length;

    int minDen = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] <= amt) {
        int coinsAmt = amt / arr[i];
        minDen += coinsAmt;
        amt -= coinsAmt * arr[i];
      }

      if (amt == 0)
        break;
    }

    return minDen;
  }

  public static void main(String[] args) {
    int arr[] = { 5, 10, 2, 1, 500, 100, 20, 50 };
    int amount = 1024;

    int res = minimumDenominations(arr, amount);
    System.out.println("MINIMUM DENOMINATIONS: " + res);
  }
}
