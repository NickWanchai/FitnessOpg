package fitnessOpgave;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Member member = new Member();
        FullMember fullMember = new FullMember();
        CreationHandler creation = new CreationHandler();


        List<Person> memberList = new ArrayList<>();
        memberList.add(creation.createBasicMember("Julius", "2606944124"));
        memberList.add(creation.createFull("Mads", "1008981234"));

        System.out.printf("FITNESS Members" + "\n" + "%-10s %-10s %-10s %-10s", " Name", "CPR", "MemberType", "Fee" + "\n" + "*********************************************** " + "\n");

        for (Person members : memberList) {
            System.out.println(members);
        }

        List<Person> employeeList = new ArrayList<>();
        employeeList.add(creation.createInstructor("Niko", "1412932343", 37));
        employeeList.add(creation.createAdminEmployee("Max", "0911941721"));

        System.out.printf("\n" + "FITNESS EMPOLYEES" + "\n" + "%-10s %-10s %-10s %-10s %-10s", " Name", "CPR", "Hours", "Vacation", "Salary" + "\n" + "*********************************************** " + "\n");

        for (Person employees : employeeList) {
            System.out.println(employees);
        }


        List<Person> personList = new ArrayList<>();
        personList.addAll(memberList);
        personList.addAll(employeeList);

        System.out.printf("\n" + "EMPOLYEES & MEMBERS" + "\n" + "%-10s %-10s", " Name", "CPR" + "\n" + "*********************************************** " + "\n");

        for (Person persons : personList) {
            System.out.printf("%-10s %-10s", persons.getName(), persons.getCpr() + "\n");
        }


    }

}
