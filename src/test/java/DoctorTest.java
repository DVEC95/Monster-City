import org.junit.Before;
import org.junit.Test;
import people.Doctor;

import static org.junit.Assert.assertEquals;

public class DoctorTest {

    Doctor doctor;

    @Before
    public void before(){
        doctor = new Doctor("Dr. Mario", 42, 50000, 0);
    }

    @Test
    public void hasName(){
        assertEquals("Dr. Mario", doctor.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(42, doctor.getAge());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, doctor.getSalary());
    }

    @Test
    public void hasWallet(){
        assertEquals(0, doctor.getWallet(), 0.00);
    }

    @Test
    public void canWork(){
        doctor.work(8);
        assertEquals(40.0, doctor.getWallet(), 0.00);
    }

    @Test
    public void hasOccupation(){
        assertEquals("Doctor", doctor.getOccupation());
    }

}
