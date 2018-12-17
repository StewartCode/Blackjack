public class GameRules {

    private int maxScore;
    private int maxCards;
    private boolean dealersTurn;
    private int roundNumber;
    private boolean sticking;

    public GameRules(int maxScore, int maxCards, boolean dealersTurn, int roundNumber, boolean sticking){
        this.maxScore = maxScore;
        this.maxCards = maxCards;
        this.dealersTurn = dealersTurn;
        this.roundNumber = roundNumber;
        this.sticking = sticking;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getMaxCards() {
        return maxCards;
    }

    public void setMaxCards(int maxCards) {
        this.maxCards = maxCards;
    }

    public boolean isDealersTurn() {
        return dealersTurn;
    }

    public void setDealersTurn(boolean dealersTurn) {
        this.dealersTurn = dealersTurn;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }
    public int addOneRound(){
       return this.roundNumber += 1;
    }

    public boolean isSticking() {
        return sticking;
    }

    public void setSticking(boolean sticking) {
        this.sticking = sticking;
    }



}
