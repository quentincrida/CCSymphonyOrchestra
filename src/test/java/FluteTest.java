import org.junit.Before;
import org.junit.Test;
import players.RankType;
import players.woodwinds.Flute;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FluteTest {
    Flute flute1;
    Date startDate;

    @Before
    public void before(){
        startDate = new Date(2010, Calendar.JULY, 25);
        flute1 = new Flute("James Galway", RankType.PRINCIPAL,"Flute", "Woodwind", startDate, "Yamaha", "Gold");
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
        assertEquals("Woodwind", flute1.getSection());
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
    @Test
    public void contractType(){ assertEquals("Paid per session", flute1.contract());}
    @Test
    public void canGetPosition(){
        assertEquals(RankType.PRINCIPAL, flute1.getRank());
    }
    @Test
    public void canGetSalary(){
        assertEquals(45000, flute1.getSalary());
    }
    @Test
    public void canGetStartDate(){
        assertEquals(startDate, flute1.getStartDate());
    }
}
