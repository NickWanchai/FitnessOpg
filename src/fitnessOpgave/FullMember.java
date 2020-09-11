package fitnessOpgave;


public class FullMember extends Member {

    private String memberType = "Full ";
    private int fee = 299;

    public FullMember() {
    }

    public FullMember(String name, String cpr) {
        super(name, cpr);
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s", getName(), getCpr(), memberType, fee);

    }

}
