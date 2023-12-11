package Module_2_3;
import java.util.Comparator;

public class RankComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        String rank1 = o1.getRank();
        String rank2 = o2.getRank();
        // If both cards have the same rank

        if (rank1.equals(rank2))
            return 0;
        // If the first card is a face card
        if (o1.isFaceCard()) {
            // If the second card is not a face card, the first is always greater
            if (!o2.isFaceCard())
                return -1;
            // Compare face cards based on their predefined order (K > Q > J)
            switch (rank1) {
                case "K":
                    return -1; // King is always greater than other face cards
                case "Q":
                    // Queen is greater than Jack but less than King
                    if (rank2.equals("K")) return 1;
                    return -1;
                case "J":
                    // Jack is less than both King and Queen
                    if (rank2.equals("K") || rank2.equals("Q")) return 1;
                    return -1;
            }
        }
        else if (o2.isFaceCard()) {
            // If the second card is a face card and the first is not, the second is always greater
            return 1;
        }

        // If neither are face cards, compare their numeric ranks
        return Integer.parseInt(rank1) > Integer.parseInt(rank2) ? -1 : 1;
    }
}

