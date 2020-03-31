package ru.javaschool.transport.cars;

public class PassengerCar extends Car {

    private int year;

    public PassengerCar(String registerNumber) {
        super(registerNumber);
    }

    public PassengerCar(String registerNumber, int year) {
        super(registerNumber);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
