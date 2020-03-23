package com.company;

public class Acceptor {
    String fio;
    String address;
    String fioSupervisor;
    double GroupNumber;
    double WorkExperience;

    public Acceptor(String fio, String address, String fioSupervisor, double GroupNumber) {
        this.fio = fio;
        this.address = address;
        this.fioSupervisor = fioSupervisor;
        this.GroupNumber = GroupNumber;
    }

    public String getInfo(){
        return "" + this.fio + " " + this.address + " " + this.fioSupervisor + " "
                + this.GroupNumber + " " + this.WorkExperience;
    }
}


