package Multithreading;

import Inheritance.Student;

public class PrintNumber implements Runnable{
    int x;

    public PrintNumber(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println("Print number ->" + x + " -> " + Thread.currentThread().getName());
    }
}
