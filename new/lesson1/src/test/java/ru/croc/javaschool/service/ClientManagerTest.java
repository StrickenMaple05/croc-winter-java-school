package ru.croc.javaschool.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import ru.croc.javaschool.model.Gender;
import ru.croc.javaschool.model.PhysicalClient;

import java.time.LocalDate;
import java.util.UUID;

public class ClientManagerTest {

    @Test
    void testActivateClient() {
        PhysicalClient physicalClient =
                new PhysicalClient(UUID.randomUUID().toString(), LocalDate.now(), false, "1", "2", "3", Gender.Male, LocalDate.now().minusYears(20));
        ClientManager clientManager = new ClientManager();
        clientManager.activateClient(physicalClient);

        assertEquals(true, physicalClient.isActive());
    }
}
