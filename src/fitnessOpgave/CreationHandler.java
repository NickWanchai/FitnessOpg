package fitnessOpgave;


public class CreationHandler {

    //Denne klasse tager sig af oprettelser af objekter

    public Person createBasicMember(String name, String cpr) {
        Person BasicMember = new Member(name, cpr);
        return BasicMember;
    }

    public Person createFull(String name, String cpr) {
        Person fullMember = new FullMember(name, cpr);
        return fullMember;
    }

    public Person createInstructor(String name, String cpr, int hours) {
        Person instructor = new Instructor(name, cpr, hours);
        return instructor;

    }

    public Person createAdminEmployee(String name, String cpr) {
        Person adminEmp = new AdminEmployee(name, cpr);
        return adminEmp;

    }

}
