import java.util.Scanner;

public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] result = new int[4];

        int index = 0;

        for (int i = 6; i <= 9; i++) {
            result[index++] = num * i;
        }

        index = 0;

        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + result[index++]);
        }
    }
}