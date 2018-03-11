package Accessories;

import Enums.AccessoryType;
import Interfaces.ISell;

public abstract class Accessory {
    private AccessoryType accessoryType;
    private String name;
    private int stockprice;
    private int sellprice;

    public Accessory(AccessoryType accessoryType, String name, int stockprice, int sellprice) {
        this.accessoryType = accessoryType;
        this.name = name;
        this.stockprice = stockprice;
        this.sellprice = sellprice;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public String getName() {
        return name;
    }

    public int getStockprice() {
        return stockprice;
    }

    public int getSellprice() {
        return sellprice;
    }


}
