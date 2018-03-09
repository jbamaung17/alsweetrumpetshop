import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.STRINGS, Colour.SUNBURST, "Gibson", "A very nice Gibson", Material.WOOD, 50, 300, 6);
    }

    @Test
    public void guitarHasMake() {
        assertEquals("Gibson",guitar.getMake());
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("The mystical sounds of Charo reside in your head when you hold this guitar, and suddenly, as if by magic, you channel the Godessliness of Charo and begin to strum along to similar flamenco music.", guitar.play());
    }

    @Test
    public void guitarCanFigureOutMarkUp() {
        assertEquals(250, guitar.calculateMarkup());
    }
}
