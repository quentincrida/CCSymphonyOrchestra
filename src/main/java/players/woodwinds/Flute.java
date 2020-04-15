package players.woodwinds;

import behaviours.IPlay;
import players.Musician;
import players.RankType;

public class Flute extends Musician implements IPlay {
    private String manufacturer;
    private String material;

    public Flute(String name, RankType position, String instrumentPlayed, String section, String manufacturer, String material) {
        super(name, position, instrumentPlayed, section);
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }
    public String sound(){
        return "Dulcet tones.";
    }
}
