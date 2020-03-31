package ru.croc.movie.staff;

public class Staff {

    private String name;

    private StaffType type;

    public Staff(String name, StaffType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaffType getType() {
        return type;
    }

    public void setType(StaffType type) {
        this.type = type;
    }
}
