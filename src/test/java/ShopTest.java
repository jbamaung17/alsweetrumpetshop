import Accessories.Accessory;
import Accessories.SheetMusic;
import Enums.AccessoryType;
import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Instruments.Violin;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Violin violin;
    SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new Shop("Sax and Violins" );
        violin = new Violin(InstrumentType.BOWEDSTRINGS, Colour.BROWN, "Stradivarius", "A nice one", Material.WOOD, 10000, 30000, 4 );
        sheetMusic = new SheetMusic(AccessoryType.SHEETMUSIC, "Resin", 4, 10);
    }

    @Test
    public void shopCanAddInstrument() {
        shop.addInstrument(violin);
        assertEquals(1, shop.amountOfInstruments());
    }

    @Test
    public void shopCanRemoveInstrument() {
        shop.addInstrument(violin);
        assertEquals(1, shop.amountOfInstruments());
        shop.removeInstrument(violin);
        assertEquals(0, shop.amountOfInstruments());
    }

    @Test
    public void shopCanAddAccessory() {
        shop.addAccessories(sheetMusic);
        assertEquals(1, shop.amountOfAccessories());
    }

    @Test
    public void shopCanRemoveAccessory() {
        shop.addAccessories(sheetMusic);
        assertEquals(1, shop.amountOfAccessories());
        shop.removeAccessory(sheetMusic);
        assertEquals(0, shop.amountOfAccessories());
    }
}
