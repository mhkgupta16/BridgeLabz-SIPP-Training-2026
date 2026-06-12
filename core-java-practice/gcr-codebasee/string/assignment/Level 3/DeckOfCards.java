import java.util.Scanner;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2","3","4","5","6","7",
                "8","9","10",
                "Jack","Queen","King","Ace"
        };

        String[] deck = new String[52];

        int k = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }

        for (int i = 0; i < deck.length; i++) {

            int random =
                    i + (int)(Math.random() *
                            (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Players: ");
        int players = sc.nextInt();

        System.out.print("Cards per player: ");
        int cards = sc.nextInt();

        int index = 0;

        for (int p = 0; p < players; p++) {

            System.out.println("\nPlayer " + (p + 1));

            for (int c = 0; c < cards; c++) {
                System.out.println(deck[index++]);
            }
        }
    }
}