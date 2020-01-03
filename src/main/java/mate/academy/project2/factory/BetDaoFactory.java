package mate.academy.project2.factory;

import mate.academy.project2.dao.BetDao;
import mate.academy.project2.dao.BetDaoImpl;

/**
 * @author Sergey Klunniy
 */
public class BetDaoFactory {
    private static BetDao instance;

    public static BetDao getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
