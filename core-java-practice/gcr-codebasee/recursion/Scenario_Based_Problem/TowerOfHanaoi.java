/*
A temple has N disks in the Tower of Hanoi puzzle. Solve it
recursively and count moves. Also implement recursive: binary
search on a sorted price list, sum of digits, reverse a string, and
check balanced parentheses without a stack.*/


 import java.util.Scanner;
 public class TowerOfHanaoi{

    static int moves = 0;

    // Tower of Hanoi
    static void hanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
            moves++;
            return;
        }

        hanoi(n - 1, A, C, B);
        System.out.println("Move disk " + n + " from " + A + " to " + C);
        moves++;
        hanoi(n - 1, B, A, C);
    }

    // Recursive Binary Search
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, high, key);
    }

    // Sum of Digits
    static int sumDigits(int n) {
        if (n == 0)
            return 0;

        return n % 10 + sumDigits(n / 10);
    }

    // Reverse String
    static String reverse(String str) {
        if (str.length() == 0)
            return "";

        return reverse(str.substring(1)) + str.charAt(0);
    }

    // Balanced Parentheses
    static boolean balanced(String s, int i, int count) {
        if (count < 0)
            return false;

        if (i == s.length())
            return count == 0;

        if (s.charAt(i) == '(')
            return balanced(s, i + 1, count + 1);

        if (s.charAt(i) == ')')
            return balanced(s, i + 1, count - 1);

        return balanced(s, i + 1, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tower of Hanoi
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        hanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moves);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500};
        System.out.print("\nEnter price to search: ");
        int key = sc.nextInt();

        int result = binarySearch(prices, 0, prices.length - 1, key);

        if (result != -1)
            System.out.println("Price found at index " + result);
        else
            System.out.println("Price not found");

        // Sum of Digits
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits = " + sumDigits(num));

        sc.nextLine(); // consume newline

        // Reverse String
        System.out.print("\nEnter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed String = " + reverse(str));

        // Balanced Parentheses
        System.out.print("\nEnter parentheses expression: ");
        String exp = sc.nextLine();

        if (balanced(exp, 0, 0))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        sc.close();
    }
}