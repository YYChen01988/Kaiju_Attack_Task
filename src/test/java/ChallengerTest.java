import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ChallengerTest {

    Challenger challenger;
    Mothra mothra;
    Godzilla godzilla;

    @Before
    public void setUp() throws Exception {
        this.challenger = new Challenger("Tank", 200, 20);
        this.godzilla = new Godzilla("Godzilla", 100,60);
        this.mothra = new Mothra("Mothra", 120, 40);
    }

    @Test
    public void canAttack() {
        challenger.attack(godzilla);
        assertEquals(80, godzilla.getHealthValue());
    }

    @Test
    public void getType() {
        assertEquals("Tank", challenger.getType());
    }

    @Test
    public void canGetDamage() {
        challenger.demageHealth(mothra);
        assertEquals(160, challenger.getHealthValue());
    }
}
