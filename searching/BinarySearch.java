package searching;

public class BinarySearch {
  public static int binarySearch(int arr[], int key) {
    int n = arr.length;
    int low = 0;
    int high = n - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (key == arr[mid]) {
        return mid;
      } else if (key < arr[mid]) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
    int key = 23;

    int res = binarySearch(arr, key);
    if (res == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index: " + res);
    }
  }
}