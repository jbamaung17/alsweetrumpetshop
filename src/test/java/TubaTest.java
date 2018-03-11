import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {
    Tuba tuba;

    @Before
    public void before() {
        tuba = new Tuba(InstrumentType.BRASS, Colour.GOLD, "John Packer", "JP 77074", Material.BRASS, 400, 600, 600);
    }

    @Test
    public void tubaCanPlay() {
        assertEquals("As you blow into the mouth piece of the tuba a small mouse pops out looking perturbed, it's cute, but you feel kind of dirty that you put your mouth there.", tuba.play());
    }

    @Test
    public void tubaCanCalculateMarkup() {
        assertEquals(200, tuba.calculateMarkup());
    }


}
