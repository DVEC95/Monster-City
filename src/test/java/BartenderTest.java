import org.junit.Before;
import org.junit.Test;
import people.Bartender;

import static org.junit.Assert.assertEquals;

public class BartenderTest {

    Bartender bartender;

    @Before
    public void before(){
        bartender = new Bartender("Brewster", 45, 20000, 0);
    }

    @Test
    public void hasName(){
        assertEquals("Brewster", bartender.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(45, bartender.getAge());
    }

    @Test
    public void hasSalary(){
        assertEquals(20000, bartender.getSalary());
    }

    @Test
    public void hasWallet(){
        assertEquals(0, bartender.getWallet(), 0.00);
    }

    @Test
    public void canWork(){
        bartender.work(8);
        assertEquals(16.0, bartender.getWallet(), 0.00);
    }

    @Test
    public void hasOccupation(){
        assertEquals("Bartender", bartender.getOccupation());
    }

}
