import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.Color;

public class BoardGlassPaneTest {
    private BoardGlassPane glassPane;

    @Before
    public void setUp() {
        glassPane = new BoardGlassPane();
    }

    @Test
    public void testAddLine() {
        glassPane.addLine(0, 0, 100, 100, Color.BLUE);
        assertEquals("Should have 1 line after adding a line", 1, glassPane.getLinesCount());
    }

    @Test
    public void testClearLines() {
        glassPane.addLine(0, 0, 100, 100, Color.BLUE);
        glassPane.clearLines();
        assertEquals("Should have 0 lines after clearing", 0, glassPane.getLinesCount());
    }
}