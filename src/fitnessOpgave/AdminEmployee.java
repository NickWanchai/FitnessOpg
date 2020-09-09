package fitnessOpgave;

public class AdminEmployee extends Employee{

    int hours = 37;
    int vacation = 5;
    double salary = 33000;

    public AdminEmployee(String name, String cpr) {
        super(name, cpr);

    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s", getName(), getCpr(), hours, vacation, salary);

    }
}
