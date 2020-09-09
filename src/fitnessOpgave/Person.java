package fitnessOpgave;

public class Person {


    private String name;
    private String cpr;

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public Person() {
    }

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }


    @Override
    public String toString() {
        return String.format("%-10s %-10s", name, cpr);
    }
}




