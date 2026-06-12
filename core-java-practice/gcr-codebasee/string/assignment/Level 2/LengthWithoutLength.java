import java.util.Scanner;

public class LengthWithoutLength {

    public static int findLength(String s) {
        int count = 0;

        while (true) {
            try {
                s.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.println("Manual length: " + findLength(s));
        System.out.println("Built-in length: " + s.length());
    }
}