package mate.academy.lessons.readFile;

import java.io.*;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    public static void main(String[] args) {
        printWriter();
    }
    private static void printWriter() {
        File myFile = new File("text2.txt");
        try (PrintWriter fw =new PrintWriter (new BufferedWriter(new FileWriter(myFile, true)))){

            fw.write("Hello world!\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeBuffer() {
        File myFile = new File("text2.txt");
        try (BufferedWriter fw = new BufferedWriter(new FileWriter(myFile, true))){

            fw.write("Hello world!\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        File myFile = new File("text2.txt");
        try (FileWriter fw = new FileWriter(myFile)){
            fw.write("Hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read() {
        try {
            FileReader fr = new FileReader("text2.txt");
            int st = fr.read();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
