import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String computer() {
        String[] arr = {"Rock", "Paper", "Scissors"};
        return arr[new Random().nextInt(3)];
    }

    public static String winner(String u, String c) {
        if (u.equals(c)) return "Draw";

        if ((u.equals("Rock") && c.equals("Scissors")) ||
                (u.equals("Paper") && c.equals("Rock")) ||
                (u.equals("Scissors") && c.equals("Paper")))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int u = 0, c = 0;

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = computer();

            String w = winner(user, comp);

            if (w.equals("User")) u++;
            else if (w.equals("Computer")) c++;

            System.out.println(user + " vs " + comp + " => " + w);
        }

        System.out.println("User wins: " + u);
        System.out.println("Computer wins: " + c);
    }
}