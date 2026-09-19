package sorting;

public class SelectionSort {
  public static void selectionSort(int arr[]) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap(arr, i, min);
    }
  }

  private static void swap(int arr[], int idx1, int idx2) {
    int temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
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
    selectionSort(arr);
    System.out.println("AFTER SORTING: ");
    print(arr);
  }
}