package mate.academy;

import mate.academy.controller.ConsoleHandler;
import mate.academy.di.Injector;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
// проставляет зависимости
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}
