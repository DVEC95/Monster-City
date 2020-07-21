package people;

public abstract class Person {

    private String name;
    private int age;
    private int salary;
    private double wallet;

    public Person(String name, int age, int salary, double wallet) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

}
