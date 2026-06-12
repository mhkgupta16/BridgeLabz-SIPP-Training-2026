import java.util.Scanner;

public class ShortLongWords {

    public static String[] split(String s) {
        return s.split(" ");
    }

    public static int length(String s) {
        int c = 0;
        while (true) {
            try {
                s.charAt(c++);
            } catch (Exception e) {
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = split(sc.nextLine());

        String shortest = words[0];
        String longest = words[0];

        for (String w : words) {
            if (length(w) < length(shortest)) shortest = w;
            if (length(w) > length(longest)) longest = w;
        }

        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }
}