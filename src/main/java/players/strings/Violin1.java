package players.strings;

import behaviours.IPlay;
import behaviours.IWork;
import players.Musician;
import players.RankType;

import java.util.Date;

public class Violin1 extends Musician implements IPlay, IWork {
    private String instrumentMaker;
    private String date;

    public Violin1(String name, RankType position, String instrumentPlayed,
                   String section, Date startDate, String instrumentMaker, String date) {
        super(name, position, instrumentPlayed,section, startDate);
        this.instrumentMaker = instrumentMaker;
        this.date = date;
//        this.startDate = startDate;
    }

    public String getInstrumentMaker() {
        return instrumentMaker;
    }

    public String getDate() {
        return date;
    }

//    public Date getStartDate(){
//        return startDate;
//    }

    @Override
    public String sound(){
        return "I make a glorious sound."; }

    @Override
    public String contract(){
        return "Pay per session";
    }




}
