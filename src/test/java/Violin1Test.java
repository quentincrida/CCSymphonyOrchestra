import org.junit.Before;
import org.junit.Test;
import players.strings.Violin1;

import static org.junit.Assert.assertEquals;

public class Violin1Test {
    Violin1 violin1;

    @Before
    public void before(){
        violin1 = new Violin1("Srdjan Cuca", "Violin", "First Violins","Marc Soubeyran", "2000");
    }
    @Test
    public void canGetInstrumentMaker(){
        assertEquals("Marc Soubeyran", violin1.getInstrumentMaker());
    }
    @Test
    public void canGetInstrumentDate(){
        assertEquals("2000", violin1.getDate());
    }
    @Test
    public void canGetMusicianName(){
        assertEquals("Srdjan Cuca", violin1.getName());
    }
    @Test
    public void canGetMusicianSection(){
        assertEquals("First Violins", violin1.getSection());
    }
    @Test
    public void canGetInstrumentPlayed(){
        assertEquals("Violin", violin1.getInstrumentPlayed());
    }
    @Test
    public void soundMade(){
        assertEquals("I make a glorious sound.", violin1.sound());
    }

}
