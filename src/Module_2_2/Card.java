package Module_2_2;

import java.util.Objects;

public class Card {
    private Suit suit; // Enum representing the suit of the card
    private String rank; // Represents the rank of the card, e.g., "1" for Ace, "K" for King
    private boolean isFaceCard; // Flag to indicate if the card is a face card (King, Queen, Jack)

    /**
     * Constructor for Card.
     *
     * @param suit The suit of the card.
     * @param rank The rank of the card, where Ace is represented as '1'.
     */
    public Card(Suit suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        // Automatically determine if the card is a face card
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

    /**
     * Sets the rank of the card.
     *
     * @param rank The rank to set, automatically updates the isFaceCard flag.
     */
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
        return isFaceCard == card.isFaceCard && suit == card.suit && rank.equals(card.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank, isFaceCard);
    }

    @Override
    public String toString() {
        return String.format("Card{suit=%s, rank=%s, isFaceCard=%s}", suit, rank, isFaceCard);
    }
}
