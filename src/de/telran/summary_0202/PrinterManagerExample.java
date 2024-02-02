package de.telran.summary_0202;

public class PrinterManagerExample {

    public static void main(String[] args) {
        PrinterManager printerManager1 = PrinterManager.create();
        PrinterManager printerManager2 = PrinterManager.create();
        PrinterManager printerManager3 = PrinterManager.create();

        System.out.println(printerManager1);
        System.out.println(printerManager2);
        System.out.println(printerManager3);
    }
}
