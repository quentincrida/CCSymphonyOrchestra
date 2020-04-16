import behaviours.IPlay;
import org.junit.Before;
import org.junit.Test;
import players.RankType;
import players.percussion.Timpani;
import players.strings.Violin1;
import players.woodwinds.Flute;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OrchestraTest {
    Orchestra orchestra;
    ArrayList<IPlay> instrumentalists;
    Violin1 violin1;
    Flute flute;
    Timpani timpani;

    @Before
    public void before(){
        orchestra = new Orchestra("CodeClan Symphony Orchestra");
        instrumentalists = new ArrayList<>();
        violin1 = new Violin1("Bob Hope", RankType.CONCERTMASTER, "Violin", "Strings", "Colin Adamson", "1999");
        flute = new Flute("Casey Froome", RankType.SUBPRINCIPAL, "Flute", "Woodwinds", "Yamaha", "Silver");
        timpani = new Timpani("Bob Hope", RankType.PRINCIPAL, "Timpani", "Percussion", "Copper");
    }
    @Test
    public void orchestraHasName(){
        assertEquals("CodeClan Symphony Orchestra", orchestra.getName());

    }
    @Test
    public void startsEmpty(){
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
}
