package ru.kovalev.java.lesson7;

public class CatApp {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Рыжик", 20);
        cats[1] = new Cat("Барсик", 10);
        cats[2] = new Cat("Ася", 15);
        cats[3] = new Cat("Мурка", 5);
        cats[4] = new Cat("Блохастик", 20);
        Plate plate1 = new Plate(50);
        plate1.info();
        cats[0].eat(plate1);
        plate1.info();
        cats[1].eat(plate1);
        plate1.info();
        cats[2].eat(plate1);
        plate1.info();
        cats[3].eat(plate1);
        plate1.info();
        cats[4].eat(plate1);
        plate1.info();
        plate1.putFood(20);
        plate1.info();
        cats[4].eat(plate1);
    }
}
