package mate.academy;

import mate.academy.controller.ConsoleHandler;
import mate.academy.service.PropertyLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(PropertyLoader.getProperty("db.name"));
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.handle();
    }
}
