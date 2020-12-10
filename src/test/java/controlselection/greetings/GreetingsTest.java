package controlselection.greetings;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingsTest {

    @Test
    public void testWelcomes(){
        Greetings greetings = new Greetings();
        assertEquals(Welcomes.GOOD_NIGHT, greetings.appropriateWelcome(5, 0));
        assertEquals(Welcomes.GOOD_NIGHT, greetings.appropriateWelcome(4, 0));
        assertEquals(Welcomes.GOOD_NIGHT, greetings.appropriateWelcome(20, 1));
        assertEquals(Welcomes.GOOD_EVENING, greetings.appropriateWelcome(20, 0));
        assertEquals(Welcomes.GOOD_AFTERNOON, greetings.appropriateWelcome(9, 0));
        assertEquals(Welcomes.GOOD_AFTERNOON, greetings.appropriateWelcome(18, 29));
    }
}