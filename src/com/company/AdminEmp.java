package com.company;

public class AdminEmp extends Employee{

    int hours = 37;
    int vacation = 5;
    double salary = 33000;

    public AdminEmp() {
    }

    public AdminEmp(String name, int cpr, int hours, int vacation, double salary) {
        super(name, cpr, hours, vacation, salary);
    }

    public Employee createAdmin(String name, int cpr){
        Employee adminEmp = new AdminEmp(name, cpr, hours, vacation, salary);
        return adminEmp;

    }


}
