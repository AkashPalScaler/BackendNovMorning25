package Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Hello in main class -> " + Thread.currentThread().getName());

//        HelloWorldPrinter task = new HelloWorldPrinter();
//        Thread t = new Thread(task);
//        task.run();
//        t.start(); // Is calling runnable.run

//        PrintNumber pntask = new PrintNumber(8);
//        Thread t1 = new Thread(task);
//        t1.start();
        for(int i=1;i<=1000000;i++){
            System.out.println(i);
        }
        // Main thread
        for(int i=1;i<=1000000;i++){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }

        //Thread Pool - Fixed and Cached
        // Fixed
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        for(int i=1;i<=1000000;i++){
//            PrintNumber task = new PrintNumber(i);
//            es.execute(task);
//
//            if(i == 800000){
//                System.out.println("DEBUG");
//            }
//        }
        //Cached
//        ExecutorService es1 = Executors.newCachedThreadPool();
//        for(int i=1;i<=100;i++){
//            PrintNumber task = new PrintNumber(i);
//            es1.execute(task);
//
//            if(i == 80){
//                System.out.println("DEBUG");
//            }
//        }

        // Callable

        SquareNumber squareTask1 = new SquareNumber(10);
        SquareNumber squareTask2 = new SquareNumber(20);
        ExecutorService es = Executors.newFixedThreadPool(10);

        Future<Integer> squareTask1Future = es.submit(squareTask1); // int x2 = squareTask1.call(); //10
        Future<Integer> squareTask2Future = es.submit(squareTask2); // int y2 = squareTask2.call(); //10

        Integer task1Res = squareTask1Future.get();//waiting 10secs
        Integer task2res = squareTask2Future.get(); //

        System.out.println(task1Res);
        System.out.println(task2res);


    }
}

// HWPrinter
// PrintNumber
// PrintName
// CallImageProcessing

// Thread (Runnable task)

// Break till 8:30