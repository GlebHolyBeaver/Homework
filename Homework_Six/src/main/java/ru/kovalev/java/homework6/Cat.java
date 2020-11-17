package ru.kovalev.java.homework6;

public class Cat extends Animal{
    private static final int CAT_RUN = 200;
    private static final int CAT_SWIM = 0;
    private static final float CAT_JUMP = 2f;

    private int personalRun;
    private int personalSwim;
    private int personalJump;

     public void Catooo(int personalRun, int personalSwim, int personalJump) {
        this.personalRun = personalRun;
        this.personalSwim = personalSwim;
        this.personalJump = personalJump;
    }

    protected int maxRun() {
        return personalRun + CAT_RUN;
    }

    protected int maxSwim() {
        return personalSwim + CAT_SWIM;
    }

    protected float maxJump() {
        return personalJump + CAT_JUMP;
    }
}
