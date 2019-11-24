package mate.academy;

import mate.academy.controller.ConsoleHandler;
import mate.academy.di.Injector;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}
