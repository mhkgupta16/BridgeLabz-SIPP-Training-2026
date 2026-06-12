package assignment.Level1;
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    static void handleException(String text) {

        try {
            int num = Integer.parseInt(text);
            System.out.println("Number = " + num);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.next();

        handleException(text);
    }
}