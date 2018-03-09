package Instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import Interfaces.ISell;

public class DrumKit extends Instrument implements ISell, IPlay {
    int numberOfDrums;

    public DrumKit(InstrumentType instrumentType, Colour colour, String make, String model, Material material, int stockCost, int sellCost, int numberOfDrums) {
        super(instrumentType, colour, make, model, material,stockCost, sellCost);
        this.numberOfDrums = numberOfDrums;
    }


    @Override
    public String play() {
        return "As you tap out a rhythmic beat you find yourself losing control, suddenly you scream 'ANIMAAAAL' and furiously pound on the drum kit, a mother nearby clasps her hands over her small child's ears, you are immediately escorted from the shop by two burly members of security, one whispers 'Hail Hydra' in your ear as the unceremoniously eject you from the shop.";
    }

    @Override
    public int calculateMarkup() {
        int profit = (getSellCost() - getStockCost());
        return profit;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }
}
