import java.util.Scanner;

public class VowelConsonantCount {

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "aeiou".indexOf(c) != -1;
    }

    public static int[] count(String s) {
        int v = 0, c = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if (isVowel(ch)) v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] res = count(sc.next());

        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}