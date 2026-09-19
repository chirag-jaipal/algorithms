package sorting;

public class InsertionSort {
  public static void insertionSort(int arr[]) {
    int n = arr.length;

    int i, j;
    for (i = 1; i < n; i++) {
      int key = arr[i];
      for (j = i - 1; j >= 0 && arr[j] > key; j--) {
        arr[j + 1] = arr[j];
      }
      arr[j + 1] = key;
    }
  }

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 64, 32, 25, 45, 20, 15 };
    System.out.println("BEFORE SORTING: ");
    print(arr);
    insertionSort(arr);
    System.out.println("AFTER SORTING: ");
    print(arr);
  }
}