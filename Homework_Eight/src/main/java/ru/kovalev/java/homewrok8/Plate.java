package ru.kovalev.java.homewrok8;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды.");
        System.out.println();
    }

    public void checkFood(int amount) {
        if (this.food < amount) {
            boolean hungry = false;
            System.out.println("В тарелке мало еды, сытость: " + hungry);
        }
        if (this.food >= amount) {
            this.food -= amount;
            boolean hungry = true;
            System.out.println("Сытость: " + hungry);
        }
    }

    public void putFood(int howMany) {
        System.out.println("В тарелку доложили " + howMany + " еды.");
        this.food += howMany;
        System.out.println();
    }
}
