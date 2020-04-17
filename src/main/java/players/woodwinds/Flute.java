package players.woodwinds;

import behaviours.IPlay;
import behaviours.IWork;
import players.Musician;
import players.RankType;

import java.util.Date;

public class Flute extends Musician implements IPlay, IWork {
    private String manufacturer;
    private String material;

    public Flute(String name, RankType position, String instrumentPlayed, String section, Date startDate, String manufacturer, String material) {
        super(name, position, instrumentPlayed, section, startDate);
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

    public String contract() {return "Paid per session";}




}
