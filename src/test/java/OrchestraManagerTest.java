import management.OrchestraManager;
import org.junit.Before;
import org.junit.Test;
import players.RankType;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class OrchestraManagerTest {
    OrchestraManager orchestraManager;
    Date startDate;

    @Before
    public void before(){
        startDate = new Date(2007, Calendar.SEPTEMBER, 1);
        orchestraManager = new OrchestraManager("Ian Smith", "OM", RankType.TIER1, "210", startDate);
    }
    @Test
    public void hasName(){
        assertEquals("Ian Smith", orchestraManager.getName());
    }
    @Test
    public void getJobTitle(){
        assertEquals("OM", orchestraManager.getJobTitle());
    }
    @Test
    public void getPhoneNUmber(){
        assertEquals("210", orchestraManager.getPhoneExtension());
    }
    @Test
    public void contractType(){
        assertEquals("Permanent", orchestraManager.contract());
    }
    @Test
    public void canGetPosition(){
        assertEquals(RankType.TIER1, orchestraManager.getRank());
    }
    @Test
    public void canGetSalary(){
        assertEquals(45000, orchestraManager.getRank().getSalary());
    }
    @Test
    public void canGetStartDate(){
        assertEquals(startDate, orchestraManager.getStartDate());
    }
}
