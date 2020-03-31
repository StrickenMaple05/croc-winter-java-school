package ru.croc.movie;

import ru.croc.movie.distribution.Cinema;
import ru.croc.movie.distribution.Distributor;
import ru.croc.movie.scenario.Scenario;
import ru.croc.movie.scenario.Character;
import ru.croc.movie.staff.Staff;
import ru.croc.movie.staff.StaffType;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Character mainCharacter = new Character("Forest Gump");
        List<Character> characters = Arrays.asList(mainCharacter);

        Scenario scenario = new Scenario(
                "Эрик Рот",
                "Форест Гамп",
                "Жили были...",
                characters);

        Cinema mainCinema = new Cinema("Main cinema");
        Cinema auxCinema = new Cinema("Aux cinema");
        List<Cinema> cinemas = Arrays.asList(mainCinema, auxCinema);

        Distributor distributor = new Distributor("Distrib", cinemas);
        List<Distributor> distributors = Arrays.asList(distributor);

        Staff director = new Staff("Director", StaffType.DIRECTOR);
        List<Staff> staffList = Arrays.asList(director);

        Movie movie = new Movie("Форест Гамп", scenario, staffList, distributors);
    }
}
