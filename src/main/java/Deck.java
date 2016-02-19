import java.util.ArrayList;

public class Deck {
  private static final String[] SUITS = {"Spades", "Clubs", "Hearts", "Diamonds"};
  private static final String[] VALUES = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

  private ArrayList<Card> mCards;

  public Deck() {
    mCards = new ArrayList<Card>();
    for (String suit : SUITS) {
      for (String value : VALUES) {
        Card newCard = new Card(suit,value);
        mCards.add(newCard);
      }
    }
  }

  public ArrayList<Card> getCards(){
    return mCards;
  }
}
