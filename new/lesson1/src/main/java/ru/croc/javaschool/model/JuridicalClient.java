package ru.croc.javaschool.model;

import java.time.LocalDate;

public class JuridicalClient extends Client {

    private String name;

    private String address;

    private String ceoName;

    public JuridicalClient(String id, LocalDate regDate, boolean isActive, String name, String address,
                           String ceoName) {
        super(id, regDate, isActive);
        this.name = name;
        this.address = address;
        this.ceoName = ceoName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCeoName() {
        return ceoName;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }
}
