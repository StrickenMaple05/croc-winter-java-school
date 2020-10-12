package ru.croc.javaschool.service;

import ru.croc.javaschool.model.Client;

public class ClientManager {

    public void activateClient(Client client) {
        client.setActive(true);
    }
}
