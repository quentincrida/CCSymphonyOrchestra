package players.strings;

import behaviours.IPlay;
import players.Musician;

import java.util.Date;

public class Violin1 extends Musician implements IPlay {
    private String instrumentMaker;
    private String date;

    public Violin1(String name, String instrumentPlayed, String section, String instrumentMaker, String date) {
        super(name, instrumentPlayed,section);
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

}
