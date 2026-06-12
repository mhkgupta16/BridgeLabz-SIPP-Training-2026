import java.util.Scanner;

public class WordsWithLength2D {

    public static String[] split(String s) {
        return s.split(" ");
    }

    public static int length(String s) {
        int c = 0;
        while (true) {
            try {
                s.charAt(c);
                c++;
            } catch (Exception e) {
                break;
            }
        }
        return c;
    }

    public static String[][] buildTable(String[] words) {
        String[][] res = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(length(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] words = split(s);
        String[][] table = buildTable(words);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}