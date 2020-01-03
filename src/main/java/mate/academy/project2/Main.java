package mate.academy.project2;

import mate.academy.project2.controller.ConsoleHandler;
import mate.academy.project2.dao.BetDao;
import mate.academy.project2.dao.BetDaoImpl;
import mate.academy.project2.lib.Injector;

/**
 * @author Sergey Klunniy
 */
public class Main {
    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Если хотите сделать ставку + \n" +
                " введите сумму и риск через пробел:");
        ConsoleHandler.handle();
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());
    }
}
