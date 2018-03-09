import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void before() {
        violin = new Violin(InstrumentType.BOWEDSTRINGS, Colour.BROWN, "Stradivarius", "Original", Material.WOOD, 10000, 500000, 4);
    }

    @Test
    public void violinCanPlay() {
        assertEquals("You scratch out a poor man's version of 'Twinkle Twinkle' and as you screech through it, you are convinced you are Andre Rieu but really you sound like a primary four at a Christmas concert. Everyone walking by thinks you're a real asshole.", violin.play());
    }

    @Test
    public void violinCanCalculateMarkUp() {
        assertEquals(490000, violin.calculateMarkup());
    }

    @Test
    public void violinHasStrings() {
        assertEquals(4, violin.getNumberOfStrings());
    }
}
