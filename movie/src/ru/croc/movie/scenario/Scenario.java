package ru.croc.movie.scenario;

import java.util.List;

/**
 * Сценарий.
 *
 * @author VKhlybov
 */
public class Scenario {

    private String author;

    private String title;

    private String content;

    private List<Character> characters;

    public Scenario(String author, String title, String content, List<Character> characters) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.characters = characters;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
