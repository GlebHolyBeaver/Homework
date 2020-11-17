package ru.kovalev.java.homework6;

public class Dog extends Animal {
    private static final int DOG_RUN = 500;
    private static final int DOG_SWIM = 10;
    private static final float DOG_JUMP = 0.5f;

    private int personalRun;
    private int personalSwim;
    private float personalJump;

    public void Dog(int personalRun, int personalSwim, float personalJump) {
        this.personalRun = personalRun;
        this.personalSwim = personalSwim;
        this.personalJump = personalJump;
    }

    protected int maxRun() {
        return personalRun + DOG_RUN;
    }

    protected int maxSwim() {
        return personalSwim + DOG_SWIM;
    }

    protected float maxJump() {
        return personalJump + DOG_JUMP;
    }
}
