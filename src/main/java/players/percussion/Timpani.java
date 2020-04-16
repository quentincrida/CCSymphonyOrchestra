package players.percussion;

import behaviours.IPlay;
import behaviours.IWork;
import players.Musician;
import players.RankType;

public class Timpani extends Musician implements IPlay, IWork {
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

    public String contract(){
        return "Paid per session";
    }
}
