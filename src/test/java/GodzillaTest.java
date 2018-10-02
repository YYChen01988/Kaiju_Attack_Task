import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;
    Apache apache;

    @Before
    public void setUp() throws Exception {
        this.godzilla = new Godzilla("Godzilla", 100, 10);
        this.apache = new Apache("Helicopter", 100, 3);
    }

    @Test
    public void canRoar() {
        assertEquals("Godzilla Godzilla", godzilla.roar());
    }

    @Test
    public void gotAttacked() {
        godzilla.gotAttacked(apache);
        assertEquals(97, godzilla.getHealthValue());
    }

    @Test
    public void attack() {
        godzilla.attack(apache);
        assertEquals(80,apache.getHealthValue());
    }
}
