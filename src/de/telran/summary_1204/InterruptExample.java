package de.telran.summary_1204;

public class InterruptExample {

    private volatile static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!flag) {
            }
        });
        thread.start();

        Thread.sleep(10000);
        flag = true;
        System.out.println("My Thread was interrupted");
//        thread.interrupt();
    }
}
