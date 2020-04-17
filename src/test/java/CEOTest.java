import management.CEO;
import org.junit.Before;
import org.junit.Test;
import players.RankType;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CEOTest {
    CEO ceo;
    Date startDate;
    @Before
    public void before(){
        startDate = new Date(2012, Calendar.JULY, 27);
        ceo = new CEO("Louis Heynemann", "Chief Executive Officer", "012", RankType.TIER3, startDate);
    }
    @Test
    public void hasName(){
        assertEquals("Louis Heynemann", ceo.getName());
    }
    @Test
    public void getJobTitle(){
        assertEquals("Chief Executive Officer", ceo.getJobTitle());
    }
    @Test
    public void getPhoneNUmber(){
            assertEquals("012", ceo.getPhoneExtension());
        }
    @Test
    public void contractType(){
        assertEquals("Permanent", ceo.contract());
    }
    @Test
    public void canGetPosition(){
        assertEquals(RankType.TIER3, ceo.getRank());
    }
    @Test
    public void canGetSalary(){
        assertEquals(65000, ceo.getRank().getSalary());
    }
    @Test
    public void canGetStartDate(){
        assertEquals(startDate, ceo.getStartDate());
    }
    }


