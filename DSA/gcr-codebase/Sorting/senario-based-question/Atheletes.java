/* A sports meet has 50 atheletes with scores. sort using bubble sort, count total swaps,and flag if already sorted(best case) .repeat with insertion sort and selection sort . find top-3 medalists. trace pass by - pass  changes on array[64,25,12,22,11,45,23,44,56,56] */
/*public class Atheletes {

  static int count = 0;
  static boolean flag = false;

  static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i<n- 1; i++) {
      for (int j = 0;j<n-1-i; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          count++;
          flag = true;

        }
      }
      if (flag == false) {
        break;
      }
    }

    System.out.println(count);

  }


  

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // insertion sort
  static void insertionSort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
        count++;

      }
      arr[j + 1] = key;

    }
    System.out.println(count);
    print(arr);

  }

  // selection sort
  static void selectionSort(int arr[]) {
    int n = arr.length;
    for (int i = 0;i<n-1;i++) {
      int min_idx = i;
      for (int j =i+ 1; j < n; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
      count++;
    }
    System.out.println(count);
    print(arr);

  }

  public static void main(String[] args) {
    int arr[] = { 64, 25, 12, 22, 11, 45, 23, 44, 56, 56 };
    bubbleSort(arr);
    insertionSort(arr);
    selectionSort(arr);
    System.out.println("Sorted array");
    print(arr);
  }
}
*/

//using trace by pass method to find top 3 medalists
public class Atheletes {

    // Print Array
    static void printArray(int arr[]) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    // Copy Array
    static int[] copyArray(int arr[]) {
        int copy[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
        return copy;
    }

    // Bubble Sort
    static void bubbleSort(int arr[]) {

        int n = arr.length;
        int swaps = 0;
        boolean swapped;

        System.out.println("\n===== Bubble Sort =====");

        for (int i = 0; i < n - 1; i++) {

            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swapped = true;
                }
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);

            if (!swapped) {
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("Total Swaps = " + swaps);
    }

    // Selection Sort
    static void selectionSort(int arr[]) {

        int n = arr.length;

        System.out.println("\n===== Selection Sort =====");

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

            System.out.print("Pass " + (i + 1) + ": ");
            printArray(arr);
        }
    }

    // Insertion Sort
    static void insertionSort(int arr[]) {

        int n = arr.length;

        System.out.println("\n===== Insertion Sort =====");

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.print("Pass " + i + ": ");
            printArray(arr);
        }
    }

    // Top 3 Medalists
    static void top3(int arr[]) {

        int n = arr.length;

        System.out.println("\nTop 3 Medalists");
        System.out.println("Gold   : " + arr[n - 1]);
        System.out.println("Silver : " + arr[n - 2]);
        System.out.println("Bronze : " + arr[n - 3]);
    }

    // Main
    public static void main(String args[]) {

        int original[] = {64,25,12,22,11,45,23,44,56,56};

        System.out.println("Original Array:");
        printArray(original);

        // Bubble Sort
        int bubble[] = copyArray(original);
        bubbleSort(bubble);
        System.out.print("Sorted Array: ");
        printArray(bubble);
        top3(bubble);

        // Selection Sort
        int selection[] = copyArray(original);
        selectionSort(selection);
        System.out.print("Sorted Array: ");
        printArray(selection);
        top3(selection);

        // Insertion Sort
        int insertion[] = copyArray(original);
        insertionSort(insertion);
        System.out.print("Sorted Array: ");
        printArray(insertion);
        top3(insertion);
    }
}


