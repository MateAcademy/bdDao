package mate.academy.project.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Этот класс читает из application.properties свойство а мы передаем в string: db.name, на выходе будет или file или memory
 */
public class PropertyLoader {

    public static String getProperty(String name) throws IOException {
        Path property = Paths.get("application.properties");
        String propertyFilesString = new String(Files.readAllBytes(property));
        String result = propertyFilesString.split(" = ")[1];
        return result;
    }
}
