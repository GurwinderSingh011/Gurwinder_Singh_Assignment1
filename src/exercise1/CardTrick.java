package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise
 *
 * @author Gurwinder Singh
 * @date Jan 26, 2024
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1); // 1 to 13 (inclusive) for card values
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit index between 0 and 3
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1 to 13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter card suit (0 to 3): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);

        // Search for the user's card in the hand
        boolean found = false;
        for (Card card : hand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your guess was incorrect.");
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to
     * replace this information with your own.
     * @author Gurwinder Singh
     * @date Jan 26, 2024
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Gurwinder Singh.");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Continuously learn and grow in the field of technology");
        System.out.println("-- Make a positive impact on the world through my work");

        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Coding and exploring new technologies");
        System.out.println("-- Reading books on various subjects");
        System.out.println("-- Playing musical instruments");

        System.out.println();
    }
}
