package mate.academy.lessons.readFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("text2.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
