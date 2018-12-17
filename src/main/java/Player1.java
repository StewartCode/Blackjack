public class Player1 {

    private String name;
    private Card card1;
    private Card card2;



    public Player1(String name, Card card1, Card card2){
        this.name = name;
        this.card1 = card1;
        this.card2 = card2;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard1() {
        return card1;
    }

    public void setCard1(Card card1) {
        this.card1 = card1;
    }

    public Card getCard2() {
        return card2;
    }

    public void setCard2(Card card2) {
        this.card2 = card2;
    }


}
