package players;


public abstract class Musician {
    private String name;
    private String instrumentPlayed;
    private String section;

    public Musician(String name, String instrumentPlayed,String section) {
        this.name = name;
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


}
