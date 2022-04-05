package gameOfWarWeek6;

public class Card {
  // created a integer that set the varible 
  public final int CLUBS = 0;
  public final int DIAMONDS = 1;
  public final int SPADES = 2;
  public final int HEARTS = 3;
  
  public final int JACK = 11;
  public final int QUEEN = 12;
  public final int KING = 13;
  public final int ACE = 14;
  
  private int cardName;
  private int cardValue;
  
  // set getters and settersS
  public Card(int card, int value) {
    this.setCardName(card);
    this.setCardValue(value);
    
  }

  public int getCardName() {
    return cardName;
  }

  public void setCardName(int card) {
    this.cardName = card;
  }

  public int getCardValue() {
    return cardValue;
  }

  public void setCardValue(int cardValue) {
      this.cardValue = cardValue;
    }
  
  
  public void describe () {
    System.out.println("card is" + this.toString());
  }
  // created a to string method to call on the describe.
  public String toString() {         
    String suitAndRank = "";
    
        if (cardValue == 2) {
            suitAndRank += "Two";
        } else if (cardValue == 3) {
            suitAndRank += "Three";
        } else if (cardValue == 4) {
            suitAndRank += "Four";
        } else if (cardValue == 5) {
            suitAndRank += "Five";
        } else if (cardValue == 6) {
            suitAndRank += "Six";
        } else if (cardValue == 7) {
            suitAndRank += "Seven";
        } else if (cardValue == 8) {
            suitAndRank += "Eight";
        } else if (cardValue == 9) {
            suitAndRank += "Nine";
        } else if (cardValue == 10) {
            suitAndRank += "Ten";
        } else if (cardValue == JACK) {
            suitAndRank += "Jack";
        } else if (cardValue == QUEEN ) {
            suitAndRank += "Queen";
        } else if (cardValue == KING) {
            suitAndRank += "King";
        } else if (cardValue == ACE) {
            suitAndRank += "Ace";
        } else {
            suitAndRank += cardValue;
        }
        
        suitAndRank += " of ";
        
        if (cardName == CLUBS) {
          suitAndRank += "Clubs";
        } else if (cardName == DIAMONDS) {
          suitAndRank += "Diamonds";
        } else if (cardName == HEARTS) {
          suitAndRank+= "Hearts";
        } else if (cardName == SPADES) {
          suitAndRank += "Spades";
        }
    return suitAndRank; 
}

  
}
