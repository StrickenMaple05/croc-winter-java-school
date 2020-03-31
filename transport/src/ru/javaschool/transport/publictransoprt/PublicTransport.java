package ru.javaschool.transport.publictransoprt;

import ru.javaschool.transport.Vehicle;

public abstract class PublicTransport extends Vehicle {

    private int capacity;

    public PublicTransport(String registerNumber, int capacity) {
        super(registerNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
