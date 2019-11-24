package mate.academy.dao;

import mate.academy.di.Component;
import mate.academy.model.Client;

import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryClientDao implements ClientDao {

    /**
     * нам нужен всего один экземпляр поэтому "private final static"
     */
    private static final List<Client> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Client client) {
        inMemoryStorage.add(client);
    }

    /**
     * просто достаю первого клиента
     *
     * @return
     */
    @Override
    public Client get() {
        return inMemoryStorage.get(0);
    }
}
