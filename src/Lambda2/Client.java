package Lambda2;

import Lambda.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
//        //Method 1 : Separate task class
//        Runnable runnable0 = new HelloPrinter();
//        Runnable runnable = new HelloPrinter();
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        //Method 2: Anonymous class | Internally an anonymous class which implements Runnable
//        Runnable runnable1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world!");
//            }
//        };
//        Thread thread1 = new Thread(runnable1);
//        thread1.start();
//
//        Runnable runnable2 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world!");
//            }
//        };
//        Thread thread2 = new Thread(runnable2);
//        thread1.start();
//
//        ExampleInterface ei = new ExampleInterface() {
//            @Override
//            public void fun() {
//                System.out.println("FUN");
//            }
//
//            @Override
//            public void noFun() {
//                System.out.println("NOFUN");
//            }
//        };

        //Method 3: Lambdas (only be used with Functional Interfaces)

        Runnable runnable = () -> {
            System.out.println("Hello World!");
        };

        Thread thread0 = new Thread(runnable);

        ExampleSAMInterface esi0 = new ExampleSAMInterface() {
            @Override
            public void fun(int x) {
                System.out.println("Fun0!");
            }
        };
        ExampleSAMInterface esi = (x) -> {
            System.out.println("Fun!" + x);
        };

        esi.fun(10);
        esi0.fun(20);

        //Method 2 part B: Anonymous class extended:

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world!");
            }
        });
        thread.start();

        //Method 4: Lambda extended

        Thread thread1 = new Thread(()-> {
            System.out.println("Hello World");
        });
        thread1.start();

        System.out.println("DEBUG");

    }
}
// Break till 10:20 PM