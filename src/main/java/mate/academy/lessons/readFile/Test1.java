package mate.academy.lessons.readFile;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) throws Exception{

        DataInputStream dis = new DataInputStream(new FileInputStream("file.txt"));

        byte[] byffer = new byte[512 ];
        while (dis.available() != 0) {
            int count = dis.read(byffer);
            if (count > 0) {
                System.out.println(new String(byffer));
            }
        }
    }
}
