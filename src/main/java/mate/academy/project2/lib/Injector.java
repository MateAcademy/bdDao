package mate.academy.project2.lib;

import mate.academy.project2.controller.ConsoleHandler;
import mate.academy.project2.dao.BetDaoImpl;
import mate.academy.project2.factory.BetDaoFactory;

import java.lang.reflect.Field;

/**
 * @author Sergey Klunniy
 */
public class Injector {
    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoClass = BetDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Indect.class) != null) {
                field.setAccessible(true);
                field.set(null, new BetDaoFactory().getBetDao());
            }
        }

    }
}
