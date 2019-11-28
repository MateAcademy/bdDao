package main.java.mate.academy.dao;

import main.java.mate.academy.model.Client;

public interface ClientDao {
    void save(Client client);
    Client get();
}
