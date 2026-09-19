package sorting;

public class MergeSort {
  private static void merge(int arr[], int low, int mid, int high) {
    int tempArr[] = new int[high - low + 1];

    int i = low;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= high) {
      if (arr[i] <= arr[j]) {
        tempArr[k++] = arr[i++];
      } else {
        tempArr[k++] = arr[j++];
      }
    }

    while (i <= mid) {
      tempArr[k++] = arr[i++];
    }

    while (j <= high) {
      tempArr[k++] = arr[j++];
    }

    k = 0;
    while (k < tempArr.length) {
      arr[low++] = tempArr[k++];
    }
  }

  private static void divide(int arr[], int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      divide(arr, low, mid);
      divide(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  public static void mergeSort(int arr[]) {
    int low = 0, high = arr.length - 1;
    divide(arr, low, high);
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
    mergeSort(arr);
    System.out.println("AFTER SORTING: ");
    print(arr);
  }
}