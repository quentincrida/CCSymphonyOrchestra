import management.OrchestraManager;
import org.junit.Before;
import org.junit.Test;
import players.RankType;

import static org.junit.Assert.assertEquals;

public class OrchestraManagerTest {
    OrchestraManager orchestraManager;

    @Before
    public void before(){
        orchestraManager = new OrchestraManager("Ian Smith", "OM", RankType.TIER1, "210");
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
}
