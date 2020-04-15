import org.junit.Before;
import org.junit.Test;
import strings.Violin1;

import static org.junit.Assert.assertEquals;

public class Violin1Test {
    Violin1 violin1;

    @Before
    public void before(){
        violin1 = new Violin1("Marc Soubeyran", "2000");
    }
    @Test
    public void canGetInstrumentMaker(){
        assertEquals("Marc Soubeyran", violin1.getInstrumentMaker());
    }
    @Test
    public void canGetInstrumentDate(){
        assertEquals("2000", violin1.getDate());
    }
}
