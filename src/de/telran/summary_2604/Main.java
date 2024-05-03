package de.telran.summary_2604;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    private static int x;
    private static int y;
    private static boolean flag = true;
    private static AtomicBoolean flag2 = new AtomicBoolean(true);

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Sleeping");
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            x = 1;
            y = 2;
            flag = false;
//            flag.set(false);
        });

        Thread thread2 = new Thread(() -> {
            while (flag) {
            }
            System.out.println(x);
            System.out.println(y);
            System.out.println("Completed");
        });

        thread.start();
        thread2.start();

        flag2.set(true);
        thread.join();
        thread2.join();

//        thread2.join();

//        System.out.println(x);
//        System.out.println(y);
    }
}
