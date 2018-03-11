package Accessories;

import Enums.AccessoryType;
import Interfaces.ISell;

public class SheetMusic extends Accessory implements ISell {
    public SheetMusic(AccessoryType accessoryType, String name, int stockprice, int sellPrice) {
        super(accessoryType, name, stockprice, sellPrice);



    }

    @Override
    public int calculateMarkup() {
        return (getSellprice() - getStockprice());
    }
}
