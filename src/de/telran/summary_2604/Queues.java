package de.telran.summary_2604;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Queues {

    public static void main(String[] args) {

        Queue<Integer> integerConcurrentQueue = new ConcurrentLinkedQueue<>();

        Queue<Runnable> lambdaQueue = new ConcurrentLinkedQueue<>();

        lambdaQueue.add(() -> {
            System.out.println("HERE");
        });


//        integerConcurrentQueue.


        BlockingQueue<Integer> integerLinkedBlockingQueue = new LinkedBlockingDeque<>();
        BlockingQueue<Integer> integerArrayBlockingQueue = new ArrayBlockingQueue<>(100);


    }
}
