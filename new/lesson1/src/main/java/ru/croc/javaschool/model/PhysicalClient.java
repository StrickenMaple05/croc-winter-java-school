package ru.croc.javaschool.model;

import java.time.LocalDate;

public class PhysicalClient extends Client {

    private String firstName;

    private String lastName;

    private String middleName;

    private Gender gender;

    private LocalDate birthDate;

    public PhysicalClient(String id, LocalDate regDate, boolean isActive, String firstName, String lastName,
                          String middleName, Gender gender, LocalDate birthDate) {
        super(id, regDate, isActive);
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
