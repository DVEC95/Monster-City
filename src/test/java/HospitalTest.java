import buildings.Hospital;
import org.junit.Before;
import org.junit.Test;
import people.Bartender;
import people.Doctor;

import static org.junit.Assert.assertEquals;

public class HospitalTest {

    Hospital hospital;
    Doctor doctor1;
    Doctor doctor2;
    Bartender patient;

    @Before
    public void before(){
        doctor1 = new Doctor("Dr. Mario", 42, 50000, 250.00);
        doctor2 = new Doctor("Dr. Luigi", 40, 25000, 100.00);
        patient = new Bartender("Brewster", 35, 20000, 50.00);
        hospital = new Hospital(5, 80, 40, 100);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient);
    }

    @Test
    public void hasBuildingAttributes(){
        assertEquals(5, hospital.getFloors());
        assertEquals(80, hospital.getRooms());
        assertEquals(40, hospital.getHeightInMeters());
        assertEquals(100, hospital.getIntegrity());
    }

    @Test
    public void hasPatients(){
        assertEquals(1, hospital.getPatients().size());
    }

    @Test
    public void hasDoctors(){
        assertEquals(2, hospital.getDoctors().size());
    }

    @Test
    public void canAddPersonAsPatient(){
        hospital.addPatient(doctor1);
        assertEquals(2, hospital.getPatients().size());
    }

}
