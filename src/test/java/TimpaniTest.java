import org.junit.Before;
import org.junit.Test;
import players.RankType;
import players.percussion.Timpani;

import static org.junit.Assert.assertEquals;

public class TimpaniTest {
    Timpani timpani;

    @Before
    public void before() {
        timpani = new Timpani("Chris Mueller", RankType.TUTTI, "Timpani", "Percussion", "Bronze");
    }


    @Test
    public void getName() {
        assertEquals("Chris Mueller", timpani.getName());
    }

    @Test
    public void getInstrumentPlayed() {
        assertEquals("Timpani", timpani.getInstrumentPlayed());
    }

    @Test
    public void getSection() {
        assertEquals("Percussion", timpani.getSection());
    }

    @Test
    public void getMaterial() {
        assertEquals("Bronze", timpani.getMaterial());
    }

    @Test
    public void soundMade() {
        assertEquals("Boom, boom.", timpani.sound());
    }

    @Test
    public void canGetPosition() {
        assertEquals(RankType.TUTTI, timpani.getRank());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, timpani.getSalaryFromEnum());
    }

}