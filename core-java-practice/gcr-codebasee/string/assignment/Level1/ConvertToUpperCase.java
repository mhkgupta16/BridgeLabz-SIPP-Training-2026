

package assignment.Level1;
import java.util.Scanner;

public class ConvertToUpperCase {

    static String toUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                ch = (char)(ch - 32);

            result += ch;
        }

        return result;
    }

    static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String userUpper = toUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("User Uppercase: " + userUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);

        System.out.println("Equal: " +
                compare(userUpper, builtInUpper));
    }
}