import java.util.Scanner;

public class PalindromeCheck {

    static boolean palindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    static boolean recursive(String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return recursive(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println("Logic 1: " + palindrome(text));

        System.out.println(
                "Logic 2: " +
                        recursive(text, 0, text.length() - 1)
        );
    }
}