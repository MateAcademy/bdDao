package mate.academy.lessons.potoki;

/**
 * @author Sergey Klunniy
 */
public class Test2 {
    private  int counter;

    public static void main(String[] args) throws InterruptedException {
        Test2 test2 = new Test2();
        test2.doWork();
    }

    public  void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    counter++;
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10000 ; i++) {
                    counter++;
                }

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
