import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CardDeck {

    private List<Cards> cards = new ArrayList<>();

    public CardDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (int value = 1; value <= 13; value++) {
                cards.add(new Cards(suit, String.valueOf(value)));
            }
        }
    }

    public void sortDeck() {
        Collections.sort(cards);
    }

}