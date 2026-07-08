public class SportsMeet {

    static void bubbleSort(int arr[]) {

        int swaps = 0;
        boolean sorted = true;

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swap = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swaps++;
                    swap = true;
                    sorted = false;
                }
            }

            if (!swap)
                break;
        }

        System.out.println("Bubble Sorted Array:");

        display(arr);

        System.out.println("\nTotal Swaps = " + swaps);
        System.out.println("Already Sorted = " + sorted);

        System.out.println("Top 3 Medalists:");

        for (int i = arr.length - 1; i >= arr.length - 3; i--) {

            System.out.println(arr[i]);
        }
    }

    static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("\nInsertion Sorted Array:");
        display(arr);
    }

    static void display(int arr[]) {

        for (int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        int bubble[] = arr.clone();
        int insertion[] = arr.clone();

        bubbleSort(bubble);

        insertionSort(insertion);
    }
}
