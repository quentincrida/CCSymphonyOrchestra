package players.strings;

import behaviours.IPlay;
import behaviours.IWork;
import players.Musician;
import players.RankType;

public class Violin1 extends Musician implements IPlay, IWork {
    private String instrumentMaker;
    private String date;

    public Violin1(String name, RankType position, String instrumentPlayed, String section, String instrumentMaker, String date) {
        super(name, position, instrumentPlayed,section);
        this.instrumentMaker = instrumentMaker;
        this.date = date;
    }

    public String getInstrumentMaker() {
        return instrumentMaker;
    }

    public String getDate() {
        return date;
    }

    public String sound(){
        return "I make a glorious sound.";
    }

    public String contract(){
        return "Pay per session";
    }

}
