import java.util.Scanner;

public class NumberCheckerFive {

    public static int sumOfProperDivisors(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    public static int factorial(int number) {

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static boolean isStrong(int number) {

        int originalNumber = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum += factorial(digit);

            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println("Perfect = " + isPerfect(number));
        System.out.println("Abundant = " + isAbundant(number));
        System.out.println("Deficient = " + isDeficient(number));
        System.out.println("Strong = " + isStrong(number));
    }
}