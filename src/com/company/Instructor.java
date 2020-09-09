package com.company;

public class Instructor extends Employee{

    double salary = 199;

    public Instructor() {
    }

    public Instructor(String name, int cpr, int hours, int vacation, double salary) {
        super(name, cpr, hours, vacation, salary);
    }


    public Employee createInstructor(String name, int cpr, int hours){
        double insSalary = (salary * hours);
        Employee adminInstructor = new Instructor(name, cpr, hours, vacation, insSalary);
        return adminInstructor;

    }

}
