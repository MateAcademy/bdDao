package mate.academy.controller;

import mate.academy.dao.ClientDao;
import mate.academy.dao.FileClientDao;
import mate.academy.model.Client;

import java.util.Scanner;

public class ConsoleHandler {
    /**
     * нам нужен всего один экземпляр поэтому "private final static"
     */
    private static final ClientDao clientDao = new FileClientDao();

    void handle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию о клиенте");
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите телефон");
        String phone = scanner.nextLine();
        Client client = new Client(name, phone);


        clientDao.save(client);

    }

}
