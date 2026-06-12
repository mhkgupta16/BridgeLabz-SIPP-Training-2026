import java.util.Scanner;

public class CharacterFrequencyUnique {

    public static void frequency(String text) {

        for (int i = 0; i < text.length(); i++) {

            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j))
                    visited = true;
            }

            if (!visited) {

                int count = 0;

                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(i) == text.charAt(j))
                        count++;
                }

                System.out.println(text.charAt(i) + " -> " + count);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        frequency(sc.nextLine());
    }
}