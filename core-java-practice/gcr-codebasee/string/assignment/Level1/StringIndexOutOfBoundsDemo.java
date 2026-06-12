package assignment.Level1;
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        handleException(text);
    }
}