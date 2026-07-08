class SelectionSortExamScores {

    static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    static void display(int arr[]) {

        for (int num : arr)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int scores[] = { 70, 55, 90, 65, 80 };

        selectionSort(scores);

        System.out.println("Sorted Scores:");
        display(scores);
    }
}
