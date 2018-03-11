package Instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Piano extends Instrument implements ISell, IPlay {
    private int numberOfKeys;

    public Piano (InstrumentType instrumentType, Colour colour, String make, String model, Material material, int stockCost, int saleCost, int numberOfKeys) {
        super(instrumentType, colour, make, model, material, stockCost, saleCost);
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public String play() {
        return "You tinkle on the keys, feeling a little like Elton John, as you get more than carried away with your rendition of 'Sorry Seems to be the Hardest Word' you notice Simon from Blue in the corner, shaking his head. You've not only disappointed yourself but all the sperm and egg combinations you could have been. You sit in silence, reconsidering your life choices.";
    }

    @Override
    public int calculateMarkup() {
        return (getSellCost() - getStockCost());
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
