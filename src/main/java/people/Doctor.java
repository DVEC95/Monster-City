package people;

public class Doctor extends Person implements IWork {

    private final String occupation;

    public Doctor(String name, int age, int salary, double wallet) {
        super(name, age, salary, wallet);
        this.occupation = "Doctor";
    }

    public String getOccupation() {
        return occupation;
    }

    public void work(int hours) {
        int money = (((getSalary() / 365) / 24) * hours);
        setWallet(money);
    }

}
