package searching;

public class LinearSearch {
  public static int linearSearch(int arr[], int key) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      if (arr[i] == key) {
        return i;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 50, 30, 70, 80, 20, 90, 40 };
    int key = 70;

    int res = linearSearch(arr, key);
    if (res == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("Element found at index: " + res);
    }
  }
}