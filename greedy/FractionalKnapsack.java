package greedy;

import java.util.ArrayList;
import java.util.Collections;

class KnapsackItems implements Comparable<KnapsackItems> {
  int price;
  int weight;
  double ratio;

  public KnapsackItems(int price, int weight, double ratio) {
    this.price = price;
    this.weight = weight;
    this.ratio = ratio;
  }

  @Override
  public int compareTo(KnapsackItems item) {
    return Double.compare(item.ratio, this.ratio);
  }
}

public class FractionalKnapsack {
  public static double maxProfit(int weight[], int price[], int cap) {
    int n = weight.length;

    ArrayList<KnapsackItems> items = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      items.add(new KnapsackItems(price[i], weight[i], 1.0 * price[i] / weight[i]));
    }

    Collections.sort(items);

    double profit = 0.0;
    for (int i = 0; i < n; i++) {
      int currWeight = items.get(i).weight;
      int currPrice = items.get(i).price;
      double currRatio = items.get(i).ratio;

      if (currWeight <= cap) {
        cap -= currWeight;
        profit += currPrice;
      } else {
        profit += cap * currRatio;
        break;
      }
    }

    return profit;
  }

  public static void main(String[] args) {
    int price[] = { 21, 24, 12, 40, 30 };
    int weight[] = { 7, 4, 6, 5, 6 };
    int capacity = 20;

    System.out.println("MAXIMUM PROFIT: " + maxProfit(weight, price, capacity));
  }
}
