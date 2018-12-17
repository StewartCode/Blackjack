import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Player1 player1 = new Player1("bob",null, null);
        Dealer dealer = new Dealer( "bill", null, null);
        GameRules gameRules = new GameRules(21, 5, false, 0, false);

        StackDeck stack = new StackDeck();

     for(CardsSuit suit :  CardsSuit.values()){
         for(CardsValues values : CardsValues.values()){
              Card card = new Card(suit, values);
                  stack.addCard(card);
              }
         }
        stack.randomiseStack();

        int player1Score = stack.dealCard().getValueFromEnum() + stack.dealCard().getValueFromEnum();
        int dealerScore = stack.dealCard().getValueFromEnum() + stack.dealCard().getValueFromEnum();

        System.out.println("your current score is " + player1Score);
        System.out.println("Do you want to twist? y/n");
        String choice = br.readLine();

        if(choice.equalsIgnoreCase("y")){
            gameRules.setSticking(false);
        }else{
            gameRules.setSticking(true);
            gameRules.setDealersTurn(true);
             }


        while (player1Score <= gameRules.getMaxScore() && dealerScore <= gameRules.getMaxScore() && gameRules.getRoundNumber() < 6 ) {
              if(gameRules.isDealersTurn() == false && gameRules.isSticking() == false){
                  player1Score += stack.dealCard().getValueFromEnum();
                  gameRules.setDealersTurn(true);
                  System.out.println("player takes a card ");
              } else{
                  gameRules.setDealersTurn(true);
              }
              if(gameRules.isDealersTurn() == true && dealerScore < 17){
                  dealerScore += stack.dealCard().getValueFromEnum();
                  gameRules.setDealersTurn(false);
                  System.out.println("dealer takes a card ");
              }else{
                  gameRules.setDealersTurn(false);
              }

           if(player1Score < gameRules.getMaxScore() && dealerScore < gameRules.getMaxScore() && gameRules.isSticking() == false || gameRules.isSticking() == false && player1Score < gameRules.getMaxScore() && dealerScore < gameRules.getMaxScore() ){
               System.out.println("your current score is " + player1Score);
               System.out.println("Do you want to twist? y/n");
               String choice2 = br.readLine();

               if(choice2.equalsIgnoreCase("n")){
                   gameRules.setSticking(true);
                   gameRules.setDealersTurn(true);
               }
               else{
                   gameRules.setDealersTurn(false);
                   gameRules.setSticking(false);
               }
           }
            gameRules.addOneRound();
        }


        if(player1Score == dealerScore || player1Score > gameRules.getMaxScore() && dealerScore > gameRules.getMaxScore()){
            System.out.println("its a draw, try again");
        }else{
            if(player1Score > 21){
                System.out.println("house wins, player is bust, with a score of " + player1Score);
                System.out.println("house has a score of " + dealerScore);

            }
            if(dealerScore > 21){
                System.out.println("player1 wins, house is bust, witha score of " + dealerScore);
                System.out.println("player1 has a score of " + player1Score);

            }
            if(player1Score < 22 && dealerScore < 22){
                if(player1Score > dealerScore){
                    System.out.println("player1 wins with a score of " + player1Score);
                    System.out.println("the house loses with a score of " + dealerScore);

                }else{
                    System.out.println("dealer wins with a score of " + dealerScore);
                    System.out.println("player1 loses with a score of " + player1Score);

                }
            }
        }

        System.out.print("GAME OVER");
    }
}

