package ru.croc.movie.distribution;

import java.util.List;

public class Distributor {

    private String title;

    private List<Cinema> cinemas;

    public Distributor(String title, List<Cinema> cinemas) {
        this.title = title;
        this.cinemas = cinemas;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }
}
