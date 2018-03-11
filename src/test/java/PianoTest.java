import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(InstrumentType.KEYBOARD, Colour.WHITE, "Yamaha", "GB1K", Material.WOOD, 10000, 30000, 69);
    }

    @Test
    public void pianoHasKeys() {
        assertEquals(69, piano.getNumberOfKeys());
    }

    @Test
    public void pianoCanPlay() {
        assertEquals("You tinkle on the keys, feeling a little like Elton John, as you get more than carried away with your rendition of 'Sorry Seems to be the Hardest Word' you notice Simon from Blue in the corner, shaking his head. You've not only disappointed yourself but all the sperm and egg combinations you could have been. You sit in silence, reconsidering your life choices.", piano.play());
    }

    @Test
    public void pianoCalculatesMarkup() {
        assertEquals(20000, piano.calculateMarkup());
    }
}
