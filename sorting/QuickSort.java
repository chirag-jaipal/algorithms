package sorting;

public class QuickSort {
  private static int rearrange(int arr[], int low, int high) {
    int pivot = high;

    int i = low - 1;
    int j = low;

    while (j < high) {
      if (arr[j] < arr[pivot]) {
        swap(arr, ++i, j);
      }
      j++;
    }

    swap(arr, ++i, pivot);
    return i;
  }

  private static void partition(int arr[], int low, int high) {
    if (low < high) {
      int partitionIdx = rearrange(arr, low, high);
      partition(arr, low, partitionIdx - 1);
      partition(arr, partitionIdx + 1, high);
    }
  }

  public static void quickSort(int arr[]) {
    int low = 0, high = arr.length - 1;
    partition(arr, low, high);
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
    quickSort(arr);
    System.out.println("AFTER SORTING: ");
    print(arr);
  }
}