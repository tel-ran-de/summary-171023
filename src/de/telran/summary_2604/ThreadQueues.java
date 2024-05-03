package de.telran.summary_2604;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ThreadQueues {

    private static BlockingQueue<Integer> queue = new LinkedBlockingDeque<>(100);

    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                queue.add(i);
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            flag = true;
        });

        Thread thread2 = new Thread(() -> {
            while (!flag) {
                try {
                    Integer item = queue.take();
                    System.out.println(item);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Completed reading");
        });

        thread1.start();
        thread2.start();
    }
}
