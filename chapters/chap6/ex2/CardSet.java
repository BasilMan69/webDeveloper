package chapters.chap6.ex2;
import java.util.ArrayList;

public class CardSet {
    private ArrayList<Card> cards;

    public CardSet(ArrayList<Card> cards) {
        this.cards = cards;
    }
    public ArrayList<Card> getCards() { return cards; }

    public void shuffle() {
        for(int i = 0; i < cards.size(); i++){
            int randIndex = (int)(Math.random() * cards.size());
            Card randCard = cards.get(randIndex);
            cards.set(randIndex, cards.get(i));
            cards.set(i, randCard);
        }
    }
}
