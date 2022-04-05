package gameOfWarWeek6;

import java.util.ArrayList;
import java.util.List;

public class Player {
  List<Card> hand = new ArrayList<Card>();
  int playerScore;
  String playerName;
  
  
  public Player(String name) {
    this.playerScore = 0;
    this.playerName = name;
  }//end of Player method
  
  public void describe() {
    
    for(Card card : hand) {
      System.out.println(playerName +"'s card is a " + card);
      System.out.println("\n");
      
    }
  }// end of describe method

  public Card flip() {
    Card card= hand.get(0);
    hand.remove(card);
    return card ; 
  }// end of Flip method
  
  public void draw(Deck deck) {
    Card card = deck.draw();
    hand.add(card);
  }// end of draw method
  
  public void incrementScore() {
    this.playerScore++;
  }
  public int getScore() {
    return playerScore;
  }

  public String getName() {
    return playerName;
  }
}
