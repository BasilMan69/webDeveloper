package chapters.chap6.ex2;
import java.util.ArrayList;

public class CardTestDrive {
    public static void main(String[] args){
        ArrayList<Card> someCards = new ArrayList<>();
        Card c1 = new Card("King Of Heart");
        Card c2 = new Card("9 of Spade");
        Card c3 = new Card("Jack of Club");
        someCards.add(c1);
        someCards.add(c2);
        someCards.add(c3);
        CardSet cardDeck1 = new CardSet(someCards);
        cardDeck1.shuffle();
        for(Card c : cardDeck1.getCards()){
            System.out.println(c.getCardName());
        }
    }
}
