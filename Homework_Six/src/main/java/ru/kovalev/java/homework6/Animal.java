package ru.kovalev.java.homework6;

public abstract class Animal {
    protected abstract int maxRun();
    protected abstract int maxSwim();
    protected abstract float maxJump();

    public void run(int distance) {
        boolean canItRun = distance <= maxRun();
        System.out.println("run: " + distance + "; результат: " + canItRun);
    }

    public void swim(int distance) {
        boolean canItSwim = distance <= maxSwim();
        System.out.println("swim: " + distance + "; результат: " + canItSwim);
    }

    public void jump(float distance) {
        boolean canItJump = distance <= maxJump();
        System.out.println("jump: " + distance + "; результат: " + canItJump);
    }

}
