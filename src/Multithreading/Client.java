package Multithreading;

public class Client {
    public static void main(String[] args) {

        System.out.println("Hello in main class -> " + Thread.currentThread().getName());

        HelloWorldPrinter task = new HelloWorldPrinter();
        Thread t = new Thread(task);
//        task.run();
        t.start(); // Is calling runnable.run

//        PrintNumber pntask = new PrintNumber(8);
        Thread t1 = new Thread(task);
        t1.start();

    }
}

// HWPrinter
// PrintNumber
// PrintName
// CallImageProcessing

// Thread (Runnable task)