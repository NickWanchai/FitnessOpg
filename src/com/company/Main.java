package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee();
        AdminEmp adminEmp = new AdminEmp();
        Instructor ins = new Instructor();
        BasicMember basicMember = new BasicMember();
        FullMember fullMember = new FullMember();
        Person p = new Person();


        List<Employee> empList = new ArrayList<>();
        empList.add(adminEmp.createAdmin("Nick", 1511931331));
        empList.add(ins.createInstructor("Jonas", 1804951217, 3));

        System.out.printf("FITNESS EMPOLYEES" + "\n" + "%-10s %-10s %-10s %-10s %-10s"," Name","CPR","Hours","Salary","Vacation" + "\n" + "*********************************************** "+ "\n");

        for (Employee emp: empList) {
            System.out.println(emp);
        }

        List<BasicMember> memberList = new ArrayList<>();
        memberList.add(basicMember.createBasic("Julius", 1711931381));
        memberList.add(fullMember.createFull("Mads", 1008981234));


        System.out.printf("\n"+"FITNESS Members" + "\n" + "%-10s %-10s %-10s %-10s"," Name","CPR","MemberType","Fee"+ "\n" + "*********************************************** "+ "\n");

        for (BasicMember members: memberList) {
            System.out.println(members);
        }

    }


}
