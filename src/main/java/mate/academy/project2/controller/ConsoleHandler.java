package mate.academy.project2.controller;

import mate.academy.project2.dao.BetDao;
import mate.academy.project2.lib.Indect;
import mate.academy.project2.model.Bet;

import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class ConsoleHandler {
//аннотацию инджект ставь там где хочешь инжектить,
// а аннотацию дао ставь там где хочешь указывать че хочешь инжектить
    @Indect
    private static BetDao betDao;

    static public void handle() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("0")) {
                return;
            }

            try {
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            } catch (Exception e) {
                System.out.println("Данные введены не корректно");
            }
        }
    }
}
