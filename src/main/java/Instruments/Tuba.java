package Instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import Interfaces.ISell;

public class Tuba extends Instrument implements IPlay, ISell {
    int weight;

    public Tuba(InstrumentType instrumentType, Colour colour, String make, String model, Material material, int stockCost, int saleCost, int weight) {
        super(instrumentType, colour, make, model, material, stockCost, saleCost);
        this.weight = weight;
    }

    @Override
    public String play() {
        return "As you blow into the mouth piece of the tuba a small mouse pops out looking perturbed, it's cute, but you feel kind of dirty that you put your mouth there.";
    }

    @Override
    public int calculateMarkup() {
        int profit = (getSellCost() - getStockCost());
        return profit;
    }
}
