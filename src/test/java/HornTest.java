import org.junit.Before;
import org.junit.Test;
import players.RankType;
import players.brass.Horn;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class HornTest {
    Horn horn2;
    Date startDate;

    @Before
    public void before(){
        startDate = new Date(2017, Calendar.JUNE, 12);
        horn2 = new Horn("Peter Amon", RankType.SUBPRINCIPAL, "Horn", "Brass", startDate,"Conn");
    }
    @Test
    public void getName(){
        assertEquals("Peter Amon", horn2.getName());
    }
    @Test
    public void getInstrumentPlayed(){
        assertEquals("Horn", horn2.getInstrumentPlayed());
    }
    @Test
    public void getSection(){
        assertEquals("Brass", horn2.getSection());
    }
    @Test
    public void getManufacturer(){
        assertEquals("Conn", horn2.getManufacturer());
    }
    @Test
    public void soundMade(){
        assertEquals("Soaring melodies", horn2.sound());
    }
    @Test
    public void getContractType(){
        assertEquals("Pay per session", horn2.contract());
    }
    @Test
    public void canGetPosition(){
        assertEquals(RankType.SUBPRINCIPAL, horn2.getRank());
    }
    @Test
    public void canGetSalary(){
        assertEquals(40000, horn2.getSalaryFromEnum());
    }

    @Test
    public void canGetStartDate(){
        assertEquals(startDate, horn2.getStartDate());
    }

}
