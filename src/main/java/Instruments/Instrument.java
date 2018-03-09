package Instruments;

import Enums.Colour;
import Enums.InstrumentType;
import Enums.Material;

public abstract class Instrument {
    private InstrumentType instrumentType;
    private Colour colour;
    private String make;
    private String model;
    private Material material;
    private int stockCost;
    private int sellCost;

    public Instrument() {
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.material = material;
        this.stockCost = stockCost;
        this.sellCost = sellCost;
    }
}

