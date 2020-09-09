package com.company;

public class FullMember extends BasicMember {

    String memberType = "Full ";
    int fee = 299;

    public FullMember() {
    }

    public FullMember(String name, int cpr, String memberType, int fee) {
        super(name, cpr, memberType, fee);
    }


    public BasicMember createFull(String name, int cpr){
        BasicMember fullMember = new FullMember(name, cpr, memberType, fee);
        return fullMember;
    }
}
