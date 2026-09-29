package dynamicprogramming;

public class ZeroOneKnapsack {
  public static int maxProfit(int weight[], int price[], int cap) {
    int n = weight.length;
    int dp[][] = new int[n + 1][cap + 1];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= cap; j++) {
        int exclude = dp[i - 1][j];

        if (weight[i - 1] <= j) {
          int include = price[i - 1] + dp[i - 1][j - weight[i - 1]];
          dp[i][j] = Math.max(include, exclude);
        } else {
          dp[i][j] = exclude;
        }
      }
    }

    return dp[n][cap];
  }

  public static void main(String[] args) {
    int weight[] = { 2, 3, 4, 5 };
    int price[] = { 3, 4, 5, 6 };
    int cap = 5;

    System.out.println("MAXIMUM PROFIT: " + maxProfit(weight, price, cap));
  }
}
