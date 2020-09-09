package com.company;

public class Employee extends Person{

    int hours;
    int vacation = 0;
    double salary;

    public String getName() {
        return name;
    }

    public int getCpr() {
        return cpr;
    }

    public Employee() {
    }

    public Employee(String name, int cpr, int hours, int vacation, double salary) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
        this.vacation = vacation;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10s %-10s%-10s", name, cpr, hours, salary, vacation);
    }

    public Employee createEmp(String name, int cpr, int hours, int vacation, double salary){
        Employee emp = new Employee(name, cpr, hours, vacation, salary);
        return emp;

    }
}

