package monsters;

import buildings.Building;

public class Godzilla extends Monster {

    public Godzilla(String name, int energy, int sizeInMeters) {
        super(name, energy, sizeInMeters);
    }

    public void nuclearPulse(Building building){
        int damage = getEnergy();
        int integrity = building.getIntegrity();
        int newIntegrity = integrity - damage;
        building.setIntegrity(newIntegrity);
    }

}
