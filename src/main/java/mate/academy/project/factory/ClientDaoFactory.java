package mate.academy.project.factory;

import mate.academy.project.dao.ClientDao;
import mate.academy.project.dao.FileClientDao;
import mate.academy.project.dao.InMemoryClientDao;
import mate.academy.project.service.PropertyLoader;

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
