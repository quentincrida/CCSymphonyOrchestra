package players;


import behaviours.IPlay;
import behaviours.IWork;

public abstract class Musician implements IPlay, IWork {
    private String name;
    private String instrumentPlayed;
    private String section;
    private RankType position;

    public Musician(String name, RankType position, String instrumentPlayed, String section) {
        this.name = name;
        this.position = position;
        this.instrumentPlayed = instrumentPlayed;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public String getInstrumentPlayed(){
        return instrumentPlayed;
    }

    public String getSection() {
        return section;
    }

    public RankType getRank(){
        return this.position;
    }

    public int getSalaryFromEnum(){
        return this.position.getSalary();
    }

    public String sound(){
        return "I make this sound";
    }
    public String contract(){
        return "Permanent/Paid per session";
    }



}
