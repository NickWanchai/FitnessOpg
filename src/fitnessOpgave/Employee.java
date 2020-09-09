package fitnessOpgave;

public class Employee extends Person {


    private int vacation;
    private double salary;

    public Employee(){

    }

    public Employee(String name, String cpr) {
        super(name, cpr);
    }


    public Employee(String name, String cpr, double salary) {
        super(name, cpr);
    }

    public int getVacation() {
        return vacation;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s", getName(), getCpr(), vacation, salary);

    }


}
