import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerThree {

    public static int[] reverseArray(int[] digits) {

        int[] reverse = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        return reverse;
    }

    public static boolean compareArrays(int[] first, int[] second) {
        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String number = sc.next();

        int[] digits = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }

        int[] reverse = reverseArray(digits);

        System.out.println("Palindrome = " +
                compareArrays(digits, reverse));
    }
}