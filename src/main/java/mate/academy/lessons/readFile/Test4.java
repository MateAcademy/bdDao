package mate.academy.lessons.readFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Sergey Klunniy
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("text2.txt")).forEach(System.out::println);
    }
}
