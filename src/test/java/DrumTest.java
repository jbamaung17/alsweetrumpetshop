import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Instruments.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    DrumKit drumKit;

    @Before
    public void before() {
        drumKit = new DrumKit(InstrumentType.PERCUSSION, Colour.BLACK, "Mapex", "Tornado", Material.METAL, 250, 500, 6);
    }

    @Test
    public void drumKitCanPlay() {
        assertEquals("As you tap out a rhythmic beat you find yourself losing control, suddenly you scream 'ANIMAAAAL' and furiously pound on the drum kit, a mother nearby clasps her hands over her small child's ears, you are immediately escorted from the shop by two burly members of security, one whispers 'Hail Hydra' in your ear as the unceremoniously eject you from the shop.", drumKit.play());
    }

    @Test
    public void drumKitHasDrums() {
        assertEquals(6, drumKit.getNumberOfDrums());
    }

    @Test
    public void drumCanCalculateMarkUp() {
        assertEquals(250, drumKit.calculateMarkup());
    }
}
