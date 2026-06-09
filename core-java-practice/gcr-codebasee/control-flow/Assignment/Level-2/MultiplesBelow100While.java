import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int multiple = number;

        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
    }
}