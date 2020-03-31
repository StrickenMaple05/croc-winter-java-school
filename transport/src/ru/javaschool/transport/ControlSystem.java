package ru.javaschool.transport;

import ru.javaschool.transport.cars.PassengerCar;
import ru.javaschool.transport.cars.Truck;
import ru.javaschool.transport.publictransoprt.PublicTransport;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Система учета транспорта.
 *
 * @author VKhlybov
 */
public class ControlSystem {

    private List<Vehicle> registeredVehicles;

    public ControlSystem() {
        this.registeredVehicles = new ArrayList<>();
    }

    /**
     * Метод регистрации транспортного средства в системе.
     *
     * @param vehicle траспортное средство
     */
    public void register(Vehicle vehicle) {
        registeredVehicles.add(vehicle);
    }

    /**
     * Метод получения актуальной информации о заданном транспортном средстве.
     *
     * @param vehicle т.с.
     * @return инфа
     */
    public String getInfo(Vehicle vehicle) {
        return vehicle.toString();
    }

    public String getTrucksInfo() {
        StringBuilder infoContent = new StringBuilder();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof Truck) {
                infoContent.append(vehicle.toString());
            }
        }
        return infoContent.toString();
    }

    public int getSummaryCapacity() {
        int sum = 0;
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof PublicTransport) {
                sum += ((PublicTransport) vehicle).getCapacity();
            }
        }
        return sum;
    }

    /**
     *
     * @param diff
     * @return
     */
    public int getCarsCountManufacturedBefore(int diff) {
        int count = 0;
        int currentYear = LocalDate.now().getYear();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof PassengerCar) {
                count += currentYear - diff == ((PassengerCar) vehicle).getYear()
                        ? 1
                        : 0;
            }
        }
        return count;
    }
}
