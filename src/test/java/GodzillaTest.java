import buildings.Hospital;
import monsters.Godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GodzillaTest {

    Godzilla godzilla;
    Hospital hospital;

    @Before
    public void before(){
        godzilla = new Godzilla("Godzilla", 40, 120);
        hospital = new Hospital(5, 80, 40, 100);
    }

    @Test
    public void hasName(){
        assertEquals("Godzilla", godzilla.getName());
    }

    @Test
    public void hasEnergy(){
        assertEquals(40, godzilla.getEnergy());
    }

    @Test
    public void hasSize(){
        assertEquals(120, godzilla.getSizeInMeters());
    }

    @Test
    public void canAttack(){
        godzilla.nuclearPulse(hospital);
        assertEquals(60, hospital.getIntegrity());
    }


}