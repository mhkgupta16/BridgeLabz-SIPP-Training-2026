import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] distributeChocolates(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remainingChocolates = chocolates % children;

        return new int[]{eachChildGets, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter Children: ");
        int children = sc.nextInt();

        int[] result = distributeChocolates(chocolates, children);

        System.out.println("Each Child Gets = " + result[0]);
        System.out.println("Remaining Chocolates = " + result[1]);
    }
}