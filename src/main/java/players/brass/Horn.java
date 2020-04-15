package players.brass;

import behaviours.IPlay;
import players.Musician;
import players.RankType;

public class Horn extends Musician implements IPlay {
    private String manufacturer;

    public Horn(String name, RankType position, String instrumentPlayed, String section, String manufacturer) {
        super(name, position, instrumentPlayed, section);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String sound(){
        return "Soaring melodies";
    }
}
