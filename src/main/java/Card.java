public class Card {

    private CardsSuit suit;
    private CardsValues value;

    public Card(CardsSuit suit, CardsValues value) {
        this.suit = suit;
        this.value = value;
    }

    public CardsSuit getSuit(){
        return this.suit;
    }

    public CardsValues getValue() {
        return value;
    }

    public int getValueFromEnum() {
        return this.value.getValue();
    }

    public void setSuit(CardsSuit suit) {
        this.suit = suit;
    }

    public void setValue(CardsValues value) {
        this.value = value;
    }
}
