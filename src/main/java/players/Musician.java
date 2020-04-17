package players;


import behaviours.IPlay;
import behaviours.IWork;

import java.util.Date;

public abstract class Musician implements IPlay, IWork {
    private String name;
    private String instrumentPlayed;
    private String section;
    private RankType position;
    private Date startDate;

    public Musician(String name, RankType position, String instrumentPlayed, String section, Date startDate) {
        this.name = name;
        this.position = position;
        this.instrumentPlayed = instrumentPlayed;
        this.section = section;
        this.startDate = startDate;
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

    public Date getStartDate() { return this.startDate;}

    public int getSalaryFromEnum(){
        return this.position.getSalary();
    }


    public int getSalary(){
        return this.getSalaryFromEnum();
    }



    //    public String sound(){
//        return "";
//    }
//    public String contract(){
//        return "";
//    }



}
