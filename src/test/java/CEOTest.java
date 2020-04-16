import management.CEO;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CEOTest {
    CEO ceo;
    @Before
    public void before(){
        ceo = new CEO("Louis Heynemann", "Chief Executive Officer", "012");
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
    }


