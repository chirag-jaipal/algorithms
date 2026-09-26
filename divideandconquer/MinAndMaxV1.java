package divideandconquer;

public class MinAndMaxV1 {
  public static int[] findMinMax(int arr[], int start, int end) {
    if (start == end) {
      return new int[] { arr[start], arr[end] };
    }
    if (start + 1 == end) {
      if (arr[start] < arr[end]) {
        return new int[] { arr[start], arr[end] };
      } else {
        return new int[] { arr[end], arr[start] };
      }
    }

    int mid = start + (end - start) / 2;
    int res1[] = findMinMax(arr, start, mid);
    int res2[] = findMinMax(arr, mid + 1, end);

    int min = Math.min(res1[0], res2[0]);
    int max = Math.max(res1[1], res2[1]);

    return new int[] { min, max };
  }

  public static void main(String[] args) {
    int arr[] = { 0, 10, 5, 15, 2, 6, 8, 14, 20 };
    int n = arr.length;

    int res[] = findMinMax(arr, 0, n - 1);
    System.out.println("MIN ELE: " + res[0]);
    System.out.println("MAX ELE: " + res[1]);
  }
}
