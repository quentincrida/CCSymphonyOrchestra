import behaviours.IPlay;
import behaviours.IWork;
import management.CEO;
import management.OrchestraManager;
import org.junit.Before;
import org.junit.Test;
import players.RankType;
import players.brass.Horn;
import players.percussion.Timpani;
import players.strings.Violin1;
import players.woodwinds.Flute;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OrchestraTest {
    Orchestra orchestra;
    ArrayList<IPlay> instrumentalists;
    ArrayList<IWork> employees;
    Violin1 violin1;
    Flute flute;
    Timpani timpani;
    CEO ceo;
    Horn horn2;
    OrchestraManager orchestraManager;

    @Before
    public void before(){
        orchestra = new Orchestra("CodeClan Symphony Orchestra");
        instrumentalists = new ArrayList<>();
        employees = new ArrayList<>();
        violin1 = new Violin1("Bob Hope", RankType.CONCERTMASTER, "Violin", "Strings", "Colin Adamson", "1999");
        flute = new Flute("Casey Froome", RankType.SUBPRINCIPAL, "Flute", "Woodwinds", "Yamaha", "Silver");
        timpani = new Timpani("Bob Hope", RankType.PRINCIPAL, "Timpani", "Percussion", "Copper");
        horn2 = new Horn("Peter Amon", RankType.SUBPRINCIPAL, "Horn", "Brass", "Conn");
        ceo = new CEO("Louis Heynemann", "Chief Executive Officer", "012", RankType.TIER3);
        orchestraManager = new OrchestraManager("Ian Smith", "OM", RankType.TIER1, "210");
    }
    @Test
    public void orchestraHasName(){
        assertEquals("CodeClan Symphony Orchestra", orchestra.getName());

    }
    @Test
    public void instrumentalistsStartsEmpty(){
        assertEquals(0, orchestra.musicianCount());
    }
    @Test
    public void canAddMusicianToOrchestra() {
       orchestra.addMusician(violin1);
       assertEquals(1, orchestra.musicianCount());
    }
    @Test
    public void canRemoveMusicianFromOrchestra(){
        orchestra.addMusician(flute);
        orchestra.addMusician(timpani);
        orchestra.addMusician(violin1);
        orchestra.removeMusician(flute);
        assertEquals(2, orchestra.musicianCount());
    }

    @Test
    public void employeesStartsEmpty(){
        assertEquals(0, orchestra.employeeCount());
    }
    @Test
    public void canAddEmployeeToOrch(){
        orchestra.addEmployee(ceo);
        orchestra.addEmployee(violin1);
        assertEquals(2, orchestra.employeeCount());
    }
    @Test
    public void canRemoveEmployeeFromOrch(){
        orchestra.addEmployee(ceo);
        orchestra.addEmployee(orchestraManager);
        orchestra.addEmployee(timpani);
        orchestra.removeEmployee(ceo);
        assertEquals(2, orchestra.employeeCount());
    }

    @Test
    public void canCalculateTotalSalaries(){
        orchestra.addEmployee(timpani);
        orchestra.addEmployee(violin1);
        orchestra.addEmployee(ceo);
        orchestra.addEmployee(horn2);
        orchestra.addEmployee(flute);

        assertEquals(240000, orchestra.totalSalaries());
    }
    @Test
    public void canCalculateAverageSalary(){
        orchestra.addEmployee(timpani);
        orchestra.addEmployee(violin1);
        orchestra.addEmployee(ceo);
        orchestra.addEmployee(horn2);
        orchestra.addEmployee(flute);
        assertEquals(48000.00, orchestra.averageSalary(), 0.01);
    }
}
