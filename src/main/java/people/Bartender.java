package people;

public class Bartender extends Person implements IWork {

    private final String occupation;

    public Bartender(String name, int age, int salary, double wallet) {
        super(name, age, salary, wallet);
        this.occupation = "Bartender";
    }

    public String getOccupation() {
        return occupation;
    }

    public void work(int hours) {
        int money = (((getSalary() / 365) / 24) * hours);
        setWallet(money);
    }

}
