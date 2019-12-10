package mate.academy.lessons.potoki;

import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.hasNextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {
    private volatile  boolean running = true; //переменная может быть изменена,
    // не надо ее кешировать в памяти ядра, обеспечивает когерентность кешей

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
