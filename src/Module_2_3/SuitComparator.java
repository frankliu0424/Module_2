package Module_2_3;
import java.util.Comparator;
public class SuitComparator implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        Suit suit1 = o1.getSuit();
        Suit suit2 = o2.getSuit();

        // If both cards belong to the same suit
        if (suit1 == suit2) return 0;

        // Comparing suits based on predefined order
        switch (suit1) {
            case DIAMOND:
                // Diamond is the highest suit
                return 1;
            case CLUB:
                if (suit2 == Suit.DIAMOND) return -1;
                return 1;
            case HEART:
                if (suit2 == Suit.DIAMOND || suit2 == Suit.CLUB) return -1;
                return 1;
            case SPADE:
                // Spade is the lowest suit
                return -1;
            default:
                // This case should never occur if all suits are covered
                throw new IllegalStateException("Unexpected suit: " + suit1);
        }
    }
}
