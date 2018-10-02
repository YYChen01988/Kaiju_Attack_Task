import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ApacheTest {

    Apache apache;
    Mothra mothra;


    @Before
    public void setUp(){
        this.apache = new Apache("Helicopter", 100, 40);
        this.mothra = new Mothra("Mothra", 100, 30);
    }

    @Test
    public void canAttack() {
        apache.attack(mothra);
        assertEquals(60, mothra.getHealthValue() );
    }

    @Test
    public void canGetType() {
        assertEquals("Helicopter", apache.getType());
    }
}

