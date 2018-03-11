package Shop;

import Accessories.Accessory;
import Instruments.Instrument;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Instrument> instruments;
    private ArrayList<Accessory> accessories;

    public Shop(String name) {
        this.name = name;
        this.instruments = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public int amountOfInstruments() {
        return instruments.size();
    }

    public int amountOfAccessories() {
        return accessories.size();
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public ArrayList<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(ArrayList<Accessory> accessories) {
        this.accessories = accessories;
    }

    public void addInstrument(Instrument instrument) {
        this.instruments.add(instrument);
    }

    public void addAccessories(Accessory accessory) {
        this.accessories.add(accessory);
    }

    public void removeInstrument(Instrument instrument) {
        if (instrument instanceof Instrument) {
            this.instruments.remove(instrument);
        }
    }

    public void removeAccessory(Accessory accessory) {
        if (accessory instanceof Accessory) {
            this.accessories.remove(accessory);

        }
    }


}
