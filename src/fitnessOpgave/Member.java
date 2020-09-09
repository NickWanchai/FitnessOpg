package fitnessOpgave;

public class Member extends Person{

    private String memberType = "Basic";
    private int fee = 199;


    public Member() {
    }

    public Member(String name, String cpr) {
        super(name, cpr);

    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s", getName(), getCpr(), memberType, fee);

    }


}
