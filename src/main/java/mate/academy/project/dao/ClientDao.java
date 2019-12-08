package mate.academy.project.dao;


import mate.academy.project.model.Client;

public interface ClientDao {
    void save(Client client);
    Client get();
}
