package ru.kovalev.java.homework6;

public class CatDogApp {

    public static void main(String[] args) {
        Cat cat1 = new Cat(100, 5, 1f);
        Dog dog1 = new Dog(150, 20, 0.2f);
        cat1.run(30);
        dog1.run(100);
        cat1.swim(10);
        dog1.swim(30);
        cat1.jump(3.1f);
        dog1.jump(0.5f);
    }
}
