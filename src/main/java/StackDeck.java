import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StackDeck {

    int i = 1;

    private ArrayList<Card> deck;


    public StackDeck(){
        this.deck = new ArrayList<>();
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void addCard(Card card){
        this.deck.add(card);
    }

    public int stackSize(){
       return this.deck.size();
    }

    public ArrayList randomiseStack(){
        Collections.shuffle(this.deck);
        return this.deck;

    }
    public Card dealCard(){
            i ++;
        return this.deck.get(i);
    }
}
