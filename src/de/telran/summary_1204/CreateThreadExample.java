package de.telran.summary_1204;

public class CreateThreadExample {

    public static void main(String[] args) throws InterruptedException {

        CustomThread customThread = new CustomThread();
        customThread.setName("My thread");
        customThread.setDaemon(false);
        customThread.start();

        Thread customRunnableThread = new Thread(() -> {
            System.out.println("Hello from " + Thread.currentThread().getName());
        });
        customRunnableThread.setName("My lambda thread");
        customRunnableThread.setDaemon(false);
        customRunnableThread.start();

//        customThread.join();
    }
}

class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
