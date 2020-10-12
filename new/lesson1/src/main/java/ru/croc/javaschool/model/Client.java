package ru.croc.javaschool.model;

import java.time.LocalDate;

/**
 * Модель общего клиента.
 *
 * @author VKhlybov
 * @since 1.0.0
 */
public abstract class Client {

    /**
     * Идентификатор.
     */
    private String id;

    /**
     * Дата регистрации.
     */
    private LocalDate regDate;

    /**
     * Признак активности клиента.
     */
    private boolean isActive;

    /**
     * Конструктор.
     *
     * @param id       идентификатор
     * @param regDate  дата регистрации
     * @param isActive флаг активности
     */
    public Client(String id, LocalDate regDate, boolean isActive) {
        this.id = id;
        this.regDate = regDate;
        this.isActive = isActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
