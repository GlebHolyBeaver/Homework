package ru.kovalev.java.lesson7;

public class Cat {

    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        System.out.println("Кот " + this.name + ", с аппетитом: " + this.appetite + " пытается поесть.");
        plate.checkFood(this.appetite);
        System.out.println();
    }
// На случай если нужно вывести инфо о коте
    public void info() {
        System.out.println("Имя: " + this.name);
        System.out.println("Аппетит: " + this.appetite);
    }
}
