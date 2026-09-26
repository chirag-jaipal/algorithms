package divideandconquer;

class Pair {
  int min;
  int max;

  public Pair(int min, int max) {
    this.min = min;
    this.max = max;
  }
}

public class MinAndMaxV2 {
  private static Pair findMinMaxHelper(int arr[], int start, int end) {
    if (start == end) {
      return new Pair(arr[start], arr[start]);
    }

    if (start + 1 == end) {
      if (arr[start] < arr[end]) {
        return new Pair(arr[start], arr[end]);
      } else {
        return new Pair(arr[end], arr[start]);
      }
    }

    int mid = start + (end - start) / 2;
    Pair res1 = findMinMaxHelper(arr, start, mid);
    Pair res2 = findMinMaxHelper(arr, mid + 1, end);

    return new Pair(
        Math.min(res1.min, res2.min),
        Math.max(res1.max, res2.max));
  }

  public static Pair findMindAndMax(int arr[]) {
    return findMinMaxHelper(arr, 0, arr.length - 1);
  }

  public static void main(String[] args) {
    int arr[] = { 0, 10, 5, 15, 2, 6, 8, 14, 20 };
    Pair result = findMindAndMax(arr);

    System.out.println("MIN ELE: " + result.min);
    System.out.println("MAX ELE: " + result.max);
  }
}
