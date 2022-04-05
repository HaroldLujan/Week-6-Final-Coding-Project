package gameOfWarWeek6;

public class App {

  public static void main(String[] args) {
    
    // instantiated a deck, two players & called the shuffle method on the new deck.
    Deck newDeck = new Deck();
    
    newDeck.shuffle();
    
    Player player1 = new Player("Harold");
    Player player2 = new Player("Victoria");
    
    // Question 4 -created a for loop to iterate 52 items on the draw method
    for(int i = 0; i < 52; i++) {
      if(i % 2 == 0) {
        player1.hand.add(newDeck.draw());
      }else {
        player2.hand.add(newDeck.draw());
      }
    }
    
    player1.describe();
    player2.describe();
    
    // used a for loop to iterate 26 different times calling on the flip method.
    for(int i = 1; i<=26; i++) {
      Card player1Card = player1.flip();
      Card player2Card = player2.flip();
      System.out.println("ROUND" + ": " + i);
      
      // compared the players scores by calling on the getCardValue method.
      if(player1Card.getCardValue() > player2Card.getCardValue()) {
        player1.incrementScore();
      
      }else if(player2Card.getCardValue() > player1Card.getCardValue()) {
        player2.incrementScore();
        
      }else if(player1Card.getCardValue() == player2Card.getCardValue()) {
        player1.incrementScore();
        player2.incrementScore();
       
      }
      // comparing the scores between calling on the playerScore & playerName methods.
      if (player1.playerScore > player2.playerScore) {
        System.out.printf("%s wins this round! \n", player1.playerName);
        System.out.printf("%s's total score is: %d\n", player1.playerName, player1.playerScore);
        System.out.printf("%s's total score is: %d\n",player2.playerName, player2.playerScore);
        System.out.println("\n");
    
 
    } else if(player2.playerScore > player1.playerScore) {
        System.out.printf("%s wins this round! \n", player2.playerName);
        System.out.printf("%s 's total score is: %d\n", player2.playerName, player2.playerScore);
        System.out.printf("%s 's total score is: %d\n",player1.playerName, player1.playerScore);
        System.out.println("\n");
    } else {
        System.err.println("Draw! There are no winners this round!\n");
        System.out.printf("%s 's total score is: %d\n", player1.playerName, player1.playerScore);
        System.out.printf("%s 's total score is: %d\n", player2.playerName, player2.playerScore);
        System.out.println("\n");
   }  
  }
 }
}
