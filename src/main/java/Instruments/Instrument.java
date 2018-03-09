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

    public Instrument(InstrumentType instrumentType, Colour colour, String make, String model, Material material, int stockCost, int sellCost) {
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.material = material;
        this.stockCost = stockCost;
        this.sellCost = sellCost;

    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getStockCost() {
        return stockCost;
    }

    public void setStockCost(int stockCost) {
        this.stockCost = stockCost;
    }

    public int getSellCost() {
        return sellCost;
    }

    public void setSellCost(int sellCost) {
        this.sellCost = sellCost;
    }
}

