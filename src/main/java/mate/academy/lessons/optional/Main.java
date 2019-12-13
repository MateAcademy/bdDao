package mate.academy.lessons.optional;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        System.out.println("HI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------main");
        System.out.println("HI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------main");
        System.out.println("HI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------main");
        System.out.println("HI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------main");
        System.out.println("HI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------main");
        System.out.println("HI !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!----------main");

        Thread thread = new Thread();
        thread.start();

        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 10000; i++) {
            System.err.println("run from myThread !!!!!!!!!!!!!!!!!!");
        }
    }
}


class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10000; i++) {
            System.err.println("run from myThread2 --------------------------");
        }
    }
}