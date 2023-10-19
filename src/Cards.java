public class Cards implements Comparable<Cards> {
    private String suit;
    private String value;

    public Cards(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cards card = (Cards) obj;
        return this.suit.equals(card.suit) && this.value.equals(card.value);
    }
    @Override
    public int compareTo(Cards otherCard) {
        return Integer.compare(Integer.parseInt(this.value), Integer.parseInt(otherCard.value));
    }
}
