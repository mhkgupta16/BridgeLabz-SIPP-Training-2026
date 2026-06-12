import java.util.Scanner;

public class VowelConsonantType {

    public static String type(char c) {
        c = Character.toLowerCase(c);

        if (!Character.isLetter(c)) return "Not Letter";
        if ("aeiou".indexOf(c) != -1) return "Vowel";
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + " -> " + type(s.charAt(i)));
        }
    }
}