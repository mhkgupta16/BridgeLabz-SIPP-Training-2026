/*
A warehouse stores item quantities in an array. Find the max, min,
total stock, and detect duplicates. Extend: rotate the stock array by
k positions (simulate daily shift handover), and transpose a 2D shelf
grid.
 */

public class WarehouseStock {
  public static void main(String[] args) {
    int[] stock = { 45, 20, 60, 20, 90, 15, 60 };
    findMinMax(stock);
    findTotal(stock);
    findSearchItem(stock, 90);
    findDuplicates(stock);

    int[] rotated = rotateArray(stock, 2);
    System.out.println("Rotated array:");
    for (int num : rotated) {
      System.out.print(num + " ");
    }
    System.out.println();

    transpose(new int[][] {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    });
  }

  // find max and min
  public static void findMinMax(int[] arr) {
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
      if (arr[i] < min)
        min = arr[i];

    }
    System.out.println(max);
    System.out.println(min);
  }

  // find total stock
  public static void findTotal(int[] arr) {
    int sum = 0;
    for (int num : arr) {
      sum += num;
    }
    System.out.println(sum);
  }

  // find search stock item ex-90
  public static void findSearchItem(int[] arr, int target) {
    boolean found = false;
    for (int num : arr) {
      if (num == target) {
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println("Item found in stock.");
    } else {
      System.out.println("Item not found in stock.");
    }
  }

  // find duplicates stocks
  public static void findDuplicates(int[] arr) {
    System.out.println("Duplicate items:");
    boolean hasDuplicate = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.println(arr[i]);
          hasDuplicate = true;
          break;
        }
      }
    }
    if (!hasDuplicate) {
      System.out.println("None");
    }
  }

  // now rotate array
  public static int[] rotateArray(int[] arr, int k) {
    int n = arr.length;
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      int newindex = (i + k) % n;
      result[newindex] = arr[i];
    }
    return result;
  }

  // transpose 2d array
  public static void transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] transposed = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        transposed[j][i] = matrix[i][j];
      }
    }
    System.out.println("Transposed matrix:");
    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(transposed[i][j] + " ");
      }
      System.out.println();
    }

  }
}