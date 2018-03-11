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
}
