import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MothraTest {
    Mothra mothra;
    Apache apache;
    Challenger challenger;

    @Before
    public void setUp() throws Exception {
        this.mothra = new Mothra("Mothra", 100, 30);
        this.apache = new Apache("Helicopter", 100, 30);
        this.challenger = new Challenger("Tank", 100, 50);
    }


    @Test
    public void canRoar() {
        assertEquals("Mothra Mothra", mothra.roar());
    }

    @Test
    public void gotAttacked() {
        mothra.gotAttacked(apache);
        assertEquals(70, mothra.getHealthValue());
    }

    @Test
    public void attack() {
        mothra.attack(challenger);
        assertEquals(70,challenger.getHealthValue());
    }
}
