package gameOfWarWeek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
 
  List<Card> cardDeck = new ArrayList<Card>();
  // created a deck created a loop for cardName & cardValue.
  public Deck() {
    for(int i = 0; i< 4; i++) {
      for(int j = 2; j <= 14; j++) {
        cardDeck.add(new Card(i,j));
      }
    }
    
  }
  
  public List<Card> getCards(){
    return cardDeck;
  }
  
  public void setCards(List<Card>cardDeck) {
    this.cardDeck = cardDeck;
    
  }
  
  public void shuffle() {
    Collections.shuffle(cardDeck);
  }
  
  public Card draw() {
    Card card = cardDeck.get(0);
    cardDeck.remove(card);
    return card;
  }
  
}
