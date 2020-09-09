package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String name;
    int cpr;

    public Person(String name, int cpr) {
    }

    public Person createEmp(String name, int cpr){
        Person p = new Person(name, cpr);
        return p;

}
