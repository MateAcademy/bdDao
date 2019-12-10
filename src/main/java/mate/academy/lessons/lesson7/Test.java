package mate.academy.lessons.lesson7;

/**
 * @author Sergey Klunniy
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        MyThread myThread = new MyThread();
        myThread.start(); //этод метод создает новый поток, берет его из метода ран

        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("I am awake!");
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my Thread" + i);
        }
    }
}