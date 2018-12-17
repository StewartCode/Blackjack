import static org.junit.Assert.*;
import org.junit.*;

public class TestCard {

    Card card;

    @Before
    public void before() {
        card = new Card(CardsSuit.HEARTS, CardsValues.QUEEN);
    }

    @Test
    public void canGetSuit() {
        assertEquals(CardsSuit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValue() {
        assertEquals(CardsValues.QUEEN, card.getValue());
    }

    @Test
    public void queenHasValue10() {
        card = new Card(CardsSuit.HEARTS, CardsValues.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

}
