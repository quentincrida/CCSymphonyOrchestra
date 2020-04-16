import behaviours.IPlay;
import players.strings.Violin1;
import players.woodwinds.Flute;

import java.util.ArrayList;

public class Orchestra {
    private String name;
    private ArrayList<IPlay> instrumentalists;

    public Orchestra(String name) {
        this.name = name;
        this.instrumentalists = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int musicianCount(){
        return this.instrumentalists.size();
    }

    public void addMusician(IPlay musician) {
        this.instrumentalists.add(musician);
    }

    public void removeMusician(IPlay musician) {
        this.instrumentalists.remove(musician);
    }
}
