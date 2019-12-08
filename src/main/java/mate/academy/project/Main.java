package mate.academy.project;


import mate.academy.project.controller.ConsoleHandler;
import mate.academy.project.di.Injector;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
// проставляет зависимости
        Injector.injectDependency();
        ConsoleHandler.handle();
    }
}
