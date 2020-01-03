package mate.academy.project2.dao;

import mate.academy.project2.model.Bet;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public interface BetDao {

    void add(Bet bet);
    List<Bet> getAll();
}
