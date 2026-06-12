import java.util.Scanner;

public class SplitWordsCompare {

    public static String[] manualSplit(String s) {
        int spaces = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces];
        String temp = "";
        int idx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                words[idx++] = temp;
                temp = "";
            }
        }
        words[idx] = temp;

        return words;
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        String[] manual = manualSplit(s);
        String[] builtin = s.split(" ");

        System.out.println("Same? " + compare(manual, builtin));
    }
}