package ru.javaschool.transport.mobility;

public class Scooter extends IndividualMobility {

    public Scooter(String registerNumber) {
        super(registerNumber);
    }

    @Override
    public String toString() {
        return String.format("Scooter{ registration number: %s }", getRegisterNumber());
    }
}
