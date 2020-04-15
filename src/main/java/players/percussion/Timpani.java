package players.percussion;

import behaviours.IPlay;
import players.Musician;
import players.RankType;

public class Timpani extends Musician implements IPlay {
    private String material;

    public Timpani(String name, RankType position, String instrumentPlayed, String section, String material) {
        super(name, position, instrumentPlayed, section);
        this.material = material;
    }

    public String sound(){
        return "Boom, boom.";
    }

    public String getMaterial() {
        return material;
    }
}
