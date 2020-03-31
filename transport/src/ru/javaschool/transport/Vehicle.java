package ru.javaschool.transport;

public abstract class Vehicle {

    /**
     * Регистрационный номер в системе учета.
     */
    private String registerNumber;

    public Vehicle(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }
}
