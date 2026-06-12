import java.util.Scanner;

public class TrimWithoutTrim {

    public static int[] trim(String s) {
        int start = 0, end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    public static String manualSubstring(String s, int start, int end) {
        String r = "";
        for (int i = start; i <= end; i++) r += s.charAt(i);
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] t = trim(s);
        String manual = manualSubstring(s, t[0], t[1]);
        String builtin = s.trim();

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtin);
    }
}