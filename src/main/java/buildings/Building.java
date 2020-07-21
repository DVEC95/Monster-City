package buildings;

import people.Person;

import java.util.ArrayList;

public abstract class Building {

    private ArrayList<Person> occupants;
    private int floors;
    private int heightInMeters;
    private int rooms;
    private int integrity;

    public Building(int floors, int rooms, int heightInMeters, int integrity) {
        this.occupants = new ArrayList<Person>();
        this.floors = floors;
        this.rooms = rooms;
        this.heightInMeters = heightInMeters;
        this.integrity = integrity;
    }

    public ArrayList<Person> getOccupants() {
        return occupants;
    }

    public int getFloors() {
        return floors;
    }

    public int getHeightInMeters() {
        return heightInMeters;
    }

    public int getRooms() {
        return rooms;
    }

    public int getIntegrity(){
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }
}
