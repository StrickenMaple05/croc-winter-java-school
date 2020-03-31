package ru.croc.movie;

import ru.croc.movie.distribution.Distributor;
import ru.croc.movie.scenario.Scenario;
import ru.croc.movie.staff.Staff;

import java.util.List;

/**
 * Фильм.
 *
 * @author VKhlybov
 */
public class Movie {

    /**
     * Название.
     */
    private String title;

    /**
     * Сценарий.
     */
    private Scenario scenario;

    /**
     * Персонал.
     */
    private List<Staff> staffList;

    /**
     * Прокатчики.
     */
    private List<Distributor> distributors;

    public Movie(String title, Scenario scenario, List<Staff> staffList, List<Distributor> distributors) {
        this.title = title;
        this.scenario = scenario;
        this.staffList = staffList;
        this.distributors = distributors;
    }

    /**
     * Метод получения названия.
     *
     * @return название
     */
    public String getTitle() {
        return title;
    }

    /**
     * Метод установки значения названия.
     *
     * @param title название
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Distributor> getDistributors() {
        return distributors;
    }

    public void setDistributors(List<Distributor> distributors) {
        this.distributors = distributors;
    }
}
