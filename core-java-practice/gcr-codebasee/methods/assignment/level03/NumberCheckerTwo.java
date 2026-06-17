import java.util.Scanner;

public class NumberCheckerTwo {

    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int[] getDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int sumDigits(int[] digits) {

        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static double sumSquareDigits(int[] digits) {

        double sum = 0;

        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumDigits(digits) == 0;
    }

    public static void frequency(int[] digits) {

        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        System.out.println("Digit\tFrequency");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "\t" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Sum = " + sumDigits(digits));
        System.out.println("Sum Squares = " + sumSquareDigits(digits));
        System.out.println("Harshad = " + isHarshad(number, digits));

        frequency(digits);
    }
}