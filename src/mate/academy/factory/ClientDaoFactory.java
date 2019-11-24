package mate.academy.factory;

import mate.academy.dao.ClientDao;
import mate.academy.dao.FileClientDao;
import mate.academy.dao.InMemoryClientDao;
import mate.academy.service.PropertyLoader;

import java.io.IOException;

public class ClientDaoFactory {

    private final static ClientDao inMemoryClientDao = new InMemoryClientDao();
    private final static ClientDao fileClientDao = new FileClientDao();

    public static ClientDao getClientDao() {

        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("console")) {
                return inMemoryClientDao;
            }
        } catch (IOException e) {
            System.err.println("Нет доступа к файлу");
        }
        return fileClientDao;
    }
}
