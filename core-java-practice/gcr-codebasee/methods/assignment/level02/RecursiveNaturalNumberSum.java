import java.util.Scanner;

public class RecursiveNaturalNumberSum {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Natural Number: ");
        int n = sc.nextInt();

        int recursionResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Recursive Sum = " + recursionResult);
        System.out.println("Formula Sum = " + formulaResult);

        if (recursionResult == formulaResult) {
            System.out.println("Both results are equal");
        }
    }
}