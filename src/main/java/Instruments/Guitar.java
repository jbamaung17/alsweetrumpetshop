package Instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import Interfaces.ISell;


public class Guitar extends Instrument implements ISell, IPlay {
    private int numberOfStrings;

    public Guitar(InstrumentType instrumentType, Colour colour, String make, String model, Material material, int stockCost, int sellCost, int numberOfStrings) {
        super(instrumentType, colour, make, model, material, stockCost, sellCost);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "The mystical sounds of Charo reside in your head when you hold this guitar, and suddenly, as if by magic, you channel the Godessliness of Charo and begin to strum along to similar flamenco music.";
    }

    @Override
    public int calculateMarkup() {
        int profit = (getSellCost() - getStockCost());
        return profit;
    }
}
