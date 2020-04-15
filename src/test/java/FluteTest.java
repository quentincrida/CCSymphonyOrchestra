import org.junit.Before;
import org.junit.Test;
import players.woodwinds.Flute;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    Flute flute1;

    @Before
    public void before(){
        flute1 = new Flute("James Galway", "Flute", "Flutes", "Yamaha", "Gold");
    }
    @Test
    public void getName(){
        assertEquals("James Galway", flute1.getName());
    }
    @Test
    public void getInstrumentPlayed(){
        assertEquals("Flute", flute1.getInstrumentPlayed());
    }
    @Test
    public void getSection(){
        assertEquals("Flutes", flute1.getSection());
    }
    @Test
    public void getManufacturer(){
        assertEquals("Yamaha", flute1.getManufacturer());
    }
    @Test
    public void getMaterial(){
        assertEquals("Gold", flute1.getMaterial() );
    }
    @Test
    public void soundMade(){
        assertEquals("Dulcet tones.", flute1.sound());
    }
}
