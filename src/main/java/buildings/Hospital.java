package buildings;

import people.Doctor;
import people.IWork;

import java.util.ArrayList;

public class Hospital extends Building {

    private final ArrayList<IWork> patients;
    private final ArrayList<Doctor> doctors;

    public Hospital(int floors, int rooms, int heightInMeters, int integrity) {
        super(floors, rooms, heightInMeters, integrity);
        this.patients = new ArrayList<IWork>();
        this.doctors = new ArrayList<Doctor>();
    }

    public ArrayList<IWork> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

    public void addPatient(IWork patient){
        this.patients.add(patient);
    }

}
