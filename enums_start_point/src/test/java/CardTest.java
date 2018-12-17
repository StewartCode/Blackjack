import static org.junit.Assert.*;
        import org.junit.*;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS);
    }

    @Test
    public void canGetSuit(){
        assertEquals("Hearts",card.getSuit());
    }
}