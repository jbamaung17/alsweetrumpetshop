import Accessories.SheetMusic;
import Enums.AccessoryType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(AccessoryType.SHEETMUSIC, "Charo's introduction to Flamenco Guitar", 2, 5);
    }

    @Test
    public void sheetMusicHasName() {
        assertEquals("Charo's introduction to Flamenco Guitar", sheetMusic.getName());
    }

}
