package Module_2_3;

import java.util.Objects;

public class Card {
    private Suit suit;
    private String rank; // Represents the rank of the card, e.g., "1" for Ace, "K" for King
    private boolean isFaceCard; // Flag to indicate if the card is a face card (King, Queen, Jack)

    public Card(Suit suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        // Determine if the card is a face card
        this.isFaceCard = ("K".equals(rank) || "Q".equals(rank) || "J".equals(rank));
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
        this.isFaceCard = ("K".equals(rank) || "Q".equals(rank) || "J".equals(rank));
    }

    public boolean isFaceCard() {
        return isFaceCard;
    }

    // equals and hashCode methods are overridden to allow card comparison and usage in collections
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank.equals(card.rank) && isFaceCard == card.isFaceCard && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank, isFaceCard);
    }

    @Override
    public String toString() {
        return "Card:\n  Suit: "+suit+"\n  rank: "+rank+ "\n  "+isFaceCard;
    }
}
