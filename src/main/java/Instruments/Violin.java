package Instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Violin extends Instrument implements ISell, IPlay {
    int numberOfStrings;

    public Violin(InstrumentType instrumentType, Colour colour, String make, String model, Material material, int stockCost, int saleCost, int numberOfStrings) {
        super(instrumentType, colour, make, model, material, stockCost, saleCost);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    public String play() {
        return "You scratch out a poor man's version of 'Twinkle Twinkle' and as you screech through it, you are convinced you are Andre Rieu but really you sound like a primary four at a Christmas concert. Everyone walking by thinks you're a real asshole.";
    }

    @Override
    public int calculateMarkup() {
        int profit = (getSellCost() - getStockCost());
        return profit;
    }
}
