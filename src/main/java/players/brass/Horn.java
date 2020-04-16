package players.brass;

import behaviours.IPlay;
import behaviours.IWork;
import players.Musician;
import players.RankType;

public class Horn extends Musician implements IPlay, IWork {
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

    public String contract(){
        return "Pay per session";
    }
}
