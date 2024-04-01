import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Sprint2GameLogicTest {
    private Sprint2GameLogic gameLogic;

    @Before
    public void setUp() {
        gameLogic = new Sprint2GameLogic(3, "General", "S", "O");
    }


    @Test
    public void testSOSCountUpdate() {
        gameLogic.checkForSOS(0, 0, "S", true);
        gameLogic.checkForSOS(0, 1, "O", true);
        gameLogic.checkForSOS(0, 2, "S", true);
        assertEquals("Blue SOS count should be 1", 1, gameLogic.getSosCountBlue());
    }
}
