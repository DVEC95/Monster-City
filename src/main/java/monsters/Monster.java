package monsters;

public abstract class Monster {

    private String name;
    private int energy;
    private int sizeInMeters;

    public Monster(String name, int energy, int sizeInMeters) {
        this.name = name;
        this.energy = energy;
        this.sizeInMeters = sizeInMeters;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getSizeInMeters() {
        return sizeInMeters;
    }

}
