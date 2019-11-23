package mate.academy.dao;

import mate.academy.model.Client;

public interface ClientDao {
    void save(Client client);
    Client get();
}
