package mate.academy.lessons.lesson9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // -ea
        int a = 3;
        int b = 3;
        assert a == b : "Wrong equals";

        test();
    }

    static void test() throws Exception {
        try {
            throw new NullPointerException();           //1
        } catch (NullPointerException e) {
            try {
                throw new ArrayIndexOutOfBoundsException();  //2 Yes
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException();                        //3
        }finally {
            throw new IOException();
        }
    }
}
