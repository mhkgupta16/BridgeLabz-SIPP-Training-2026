public class Subsets {

    static void subset(int arr[], int index, String current) {

        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        subset(arr, index + 1, current);

        if (current.equals(""))
            subset(arr, index + 1, current + arr[index]);
        else
            subset(arr, index + 1, current + "," + arr[index]);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2};

        subset(arr, 0, "");
    }
}
