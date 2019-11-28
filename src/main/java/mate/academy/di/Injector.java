package main.java.mate.academy.di;

import main.java.mate.academy.controller.ConsoleHandler;
import main.java.mate.academy.dao.ClientDao;
import main.java.mate.academy.dao.FileClientDao;
import main.java.mate.academy.dao.InMemoryClientDao;
import main.java.mate.academy.factory.ClientDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    static public void injectDependency() throws IllegalAccessException {
//TODO:  можно взять все классы, найти где е сть аннотация компонент, выгрузить все классы из класслоадера
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDao = InMemoryClientDao.class;
//        Class databaseClientDao = DatabaseClientDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                boolean fileDao = fileClientDaoClass.isAnnotationPresent(Component.class);
                if (fileDao) {
                    System.out.println("Работа с файлами разрешена");
                }


                boolean inMemoryDao = inMemoryClientDao.isAnnotationPresent(Component.class);
                if (inMemoryDao) {
                    System.out.println("Работа с ОЗУ разрешена");
                }

                ClientDao clientDao = ClientDaoFactory.getClientDao(fileDao, inMemoryDao);
                field.set(null, clientDao);
            }
        }
    }
}
