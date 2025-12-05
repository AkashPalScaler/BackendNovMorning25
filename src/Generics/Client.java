package Generics;

import Inheritance.Student;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        Pair<Integer, Integer> intCoord1 = new Pair<>(10, 20);
//        Pair<String, Integer> earthQuake1 = new Pair<>("Kolkata", 2);
//        Pair<Float, Float> floatCoord1 = new Pair<>(10.4f, 20.3f);
//
//        Integer x = intCoord1.getFirst();
//
//        Pair p = new Pair("98a", 10);
//
//        Object o1 = p.getFirst();
//        Object o2 = p.getSecond();
//
//        String s = (String) p.getFirst();
//        Integer y = (Integer) p.getSecond();
//        Integer z = Integer.parseInt(s); // To read the value of a string as a integer
//        System.out.println("1"-2398);

//        List list = new ArrayList();
//        list.add(0);
//        String z1 = (String) list.get(0);
        // Object -> Animal -> Dog,Cat
        // PECS -> Producer extends, Consumer super
        List<Object> objects = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Dog> dogs = new ArrayList<Dog>();
        List<Cat> cats = new ArrayList<>();

        // It can store list of any subclass type of animal and animal -> like animal, dog, cat, etc
        List<? extends Animal> extendedAnimals = dogs;
        List<? extends Animal> extendedAnimals1 = cats;
        List<? extends Animal> extendedAnimals2 = animals;

        printAnimalNames(dogs);
        printAnimalNames(cats);
        printAnimalNames(animals);
//        List<? extends Animal> extendedAnimals3 = objects;

        // Extends -> the list can produce (You can get value)
        Animal a = extendedAnimals.get(0);
        Object a1 = extendedAnimals.get(0);
//        Dog d = extendedAnimals.get(0); // You can type cast but run the risk of runtime exception
        // Extends -> list can't consume
//        extendedAnimals.add(new Dog());
//        extendedAnimals.add(new Animal());
//        extendedAnimals.add(new Object());

        // It can store the list of any parent/super type -> Dogs, Animals, Objects
        List<? super Dog> superDogs = new ArrayList<>();

        superDogs = dogs;
        superDogs = animals;
        superDogs = objects;

        addDogToList(dogs, new Dog());
        addDogToList(animals, new Dog());
        addDogToList(objects, new Dog());

        // super -> List can't produce items
        Object oo = superDogs.get(0);
//        Animal aa = superDogs.get(0);
//        Dog dd = superDogs.get(0);

        // super -> can consume
        superDogs.add(new Dog());
//        superDogs.add(new Animal()); // Dogs
//        superDogs.add(new Object()); // Animal, Dog



    }
    // Homework -> Without using extends with wildcard can I prinat names of different animal lists
    public static void printDogNames(List<Dog> dogs){

    }
    public static void printAnimalNames0(List<Animal> animals){

    }
    public static void printCatNames(List<Cat> cats){

    }

    public static void printAnimalNames(List<? extends Animal> animals){
        for(Animal a : animals){
            System.out.println(a.name);
        }
    }

    public static void addDogToList(List<? super Dog> superDogs, Dog newDog){
        superDogs.add(newDog);
    }
}
// Break till 8:36 AM
// Animal a = new Dog();  a.bark() - X




