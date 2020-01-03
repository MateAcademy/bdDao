package mate.academy.project.controller;

import mate.academy.project.dao.ClientDao;
import mate.academy.project.di.Inject;
import mate.academy.project.model.Client;


import java.util.Scanner;

public class ConsoleHandler {
    /**
     * нам нужен всего один экземпляр поэтому "private final static"
     * @Inject помечаем поле в которое хотим внедрить
     */
    @Inject
    private static ClientDao clientDao;

    @Inject
//    private static HumanDao humanDao;

    static public void handle() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - если вносите клиента, 2 - если получаете клиента, 3 - для выхода");
            int consoleChoice = scanner.nextInt();

            switch (consoleChoice) {
                case 1:
                    addClientInfo(scanner);
                    break;
                case 2:
                    System.out.println(clientDao.get());
                    break;
                case 3:
                    scanner.close();
                    return;
                default:
                    System.out.println("Не верный ввод, повторите еще раз");
                    break;
            }

        }

    }

    static private void addClientInfo(Scanner scanner) {
        System.out.println("Введите информацию о клиенте");
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите телефон");
        String phone = scanner.next();
        Client client = new Client(name, phone);
        clientDao.save(client);
    }

}
