package assignment.Level1;
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        handleException(text);
    }
}