package Lambda;

public class Client {
    public static void main(String[] args) {
        // Method 1
        Runnable runnable = new HelloWorldPrinter();
        Thread thread = new Thread(runnable);
        thread.start();

        // Method 2 - Anonymous class
        // We are not instantiating interface - rather we are creating a class(internally) and implementing runnable and then creating an instance of that class
        Runnable runnable1 = new Runnable() {
            public void run() {
                System.out.println("Hello World -> " + Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        // Java is creating an anonymous class : class Client@2 implements ExampleInterface
        ExampleInterface exampleInterface = new ExampleInterface() {
            @Override
            public void exampleRun() {
                System.out.println("Example Run");
            }

            @Override
            public void exampleDoSomething() {
                System.out.println("Example do something");
            }
        };

        ExampleInterface exampleInterface1 = new ExampleInterface() {
            @Override
            public void exampleRun() {
                System.out.println("Example Run");
            }

            @Override
            public void exampleDoSomething() {
                System.out.println("Example do something");
            }

        };
        System.out.println("DEBUG");
        exampleInterface.exampleRun();

        // Method 3
        Runnable runnable2 = () -> {
            System.out.println("Hello World -> " + Thread.currentThread().getName());
        };
        System.out.println("DEBUG");
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        // Method 4
        Runnable runnable3 = () -> System.out.println("Hello");
        Thread thread3 = new Thread(runnable3);
        thread3.start();

        // Method 5
        Thread thread4 = new Thread(() -> System.out.println("Hello"));
        thread4.start();


    }
}

// Agenda
// Anonymous classes
// Functional interfaces and lambdas
// Functional Interfaces - SAMs - Single Abstract Method - Interfaces having single function declaration
// Examples - Runnable, Callable, Comparator, Comparable
// If we have a functional interface, then we can create lambdas for it
// You can use lambdas with only functional interfaces
// Lambda syntax - (//input params) -> {//Body of the function}
// Break till 8:13AM
// Streams
// Exceptions