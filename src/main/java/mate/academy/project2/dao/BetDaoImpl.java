package mate.academy.project2.dao;

import mate.academy.project2.db.Storage;
import mate.academy.project2.lib.Dao;
import mate.academy.project2.model.Bet;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Dao
public class BetDaoImpl implements BetDao {
    @Override
    public void add(Bet bet) {
//подключение к БД, инициализация соединения, открытие транкзакций,
//выполнение запроса, генерация этого запроса,
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
