package com.company;

public class BasicMember extends Person{

    String memberType = "Basic";
    int fee = 199;

    public String getName() {
        return name;
    }

    public int getCpr() {
        return cpr;
    }

    public BasicMember() {
    }

    public BasicMember(String name, int cpr, String memberType, int fee) {
        this.name = name;
        this.cpr = cpr;
        this.memberType = memberType;
        this.fee = fee;
    }


    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s", name, cpr, memberType, fee);

    }

    public Employee createEmp(String name, int cpr, int hours, int vacation, double salary){
        Employee emp = new Employee(name, cpr, hours, vacation, salary);
        return emp;

    }

    public BasicMember createBasic(String name, int cpr){
        BasicMember createBasic = new BasicMember(name, cpr, memberType, fee);
        return createBasic;

    }


}
