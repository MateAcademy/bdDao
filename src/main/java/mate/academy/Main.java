package main.java.mate.academy;

import main.java.mate.academy.controller.ConsoleHandler;
import main.java.mate.academy.di.Injector;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
// проставляет зависимости
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}
