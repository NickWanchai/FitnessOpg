package fitnessOpgave;

public class Instructor extends Employee {

    private int hours;
    private double hourlySalary = 199;

    public Instructor(String name, String cpr, int hours) {
        super(name, cpr);
        this.hours = hours;
    }

    public Instructor(String name, String cpr, int hours, double salary) {
        super(name, cpr, salary);

    }

    public double salary() {
        double salary = hourlySalary * hours;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s %-10s", getName(), getCpr(), hours, getVacation(), salary());

    }


}
