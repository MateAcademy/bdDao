package mate.academy.controller;

import mate.academy.dao.ClientDao;
import mate.academy.dao.FileClientDao;
import mate.academy.factory.ClientDaoFactory;
import mate.academy.model.Client;

import java.util.Scanner;

public class ConsoleHandler {
    /**
     * нам нужен всего один экземпляр поэтому "private final static"
     */
    private static final ClientDao clientDao = ClientDaoFactory.getClientDao();

    public void handle() {
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
                return;
        }

        }

    }

    private  void addClientInfo(Scanner scanner) {
        System.out.println("Введите информацию о клиенте");
        System.out.println("Введите имя:");
        String name = scanner.next();
        System.out.println("Введите телефон");
        String phone = scanner.next();
        Client client = new Client(name, phone);
        clientDao.save(client);
    }

}
