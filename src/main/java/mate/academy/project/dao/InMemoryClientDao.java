package mate.academy.project.dao;

import mate.academy.project.di.Component;
import mate.academy.project.model.Client;

import java.util.ArrayList;
import java.util.List;

//TODO: есть отдельная реализация хранения в памяти, мне нужно разобраться с ней

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
