package mate.academy.factory;

import mate.academy.dao.ClientDao;
import mate.academy.dao.FileClientDao;
import mate.academy.dao.InMemoryClientDao;
import mate.academy.service.PropertyLoader;

import java.io.IOException;

public class ClientDaoFactory {

    private static final ClientDao inMemoryDao = new InMemoryClientDao();
    private static final ClientDao fileDao = new FileClientDao();

    public static ClientDao getClientDao(boolean isFileDao, boolean isInMemoryDao) {

        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("memory") && isInMemoryDao) {
                return inMemoryDao;
            }
        } catch (IOException e) {
            System.out.println("Нет доступа к файлу");
        }
        if (isFileDao) {
            return fileDao;
        } else {
            throw new ComponentNotFoundException();
        }

    }
}
