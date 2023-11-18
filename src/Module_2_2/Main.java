package Module_2_2;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Deck deck = new Deck();
            List<Card> hand = deck.pollSeven();
            for (Card card : hand) {
                System.out.println(card);
            }
        }

}
