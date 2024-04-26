package de.telran.summary_1904;

public class RendezvousTask {

    public static void main(String[] args) throws InterruptedException {
        // Есть два потока, мы хотим обменяться данными между ними. То есть, первый поток будет ждать, когда ему придут
        // данные другого потока (и наоборот).

        Exchanger<String> exchanger = new RealExchanger<>();

        new Thread(() -> {
            String fromThread2 = exchanger.exchange("Hello from thread 1");
            System.out.println("Received from thread 2 = " + fromThread2);
        }).start();

        Thread.sleep(1_000);

        new Thread(() -> {
            String fromThread1 = exchanger.exchange("Hello from thread 2");

            System.out.println("Received from thread 1 = " + fromThread1);
        }).start();
    }
}

interface Exchanger<T> {

    T exchange(T value);
}

class RealExchanger<T> implements Exchanger<T> {
    @Override
    public T exchange(T value) {
        return null;
    }
}
