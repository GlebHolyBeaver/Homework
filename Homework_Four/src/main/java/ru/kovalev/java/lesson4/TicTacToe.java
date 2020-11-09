package ru.kovalev.java.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final char EMPTY_DOT = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final int LINE_LIMIT = 15;

    public static char[][] map;
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        // Инициализция игрового поля
        initMap();
        // Печать игрового поля
        printMap();
        // Процесс хода
        while (true) {
            // Ход человека
            humanTurn();
            // Печать
            printMap();
            // Проверка победителя
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили!");
                break;
            }
            // Проверка на заполненность поля
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            // Ход компа
            aiTurn();
            // Печать
            printMap();
            // Проверка победителя
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }
            // Проверка на заполненность поля
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена!");
        scanner.close();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int j = 0; j < LINE_LIMIT; j++) {
            System.out.println();
        }
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[y][x] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите число в формате x,y в диапозоне [1..." + SIZE + "]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!cellIsValid(x,y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!cellIsValid(x,y));
        map[y][x] = DOT_O;
    }

    public static boolean cellIsValid(int x, int y) {
        if (x < 0 || x >= SIZE) return false;
        if (y < 0 || y >= SIZE) return false;
        if (map[y][x] != EMPTY_DOT) return false;
        return true;
    }

    public static boolean checkWin(char symbol) {
        int count;
        for (int y = 0; y < SIZE; y++) {
            count = 0;
            for (int x = 0; x < SIZE; x++) {
                if (map[y][x] == symbol) count++;
                if (count == DOTS_TO_WIN) return true;
            }
        }
        for (int x = 0; x < SIZE; x++) {
            count = 0;
            for (int y = 0; y < SIZE; y++) {
                if (map[y][x] == symbol) count++;
                if (count == DOTS_TO_WIN) return true;
            }
        }
        count = 0;
        for (int x = 0, y = 0; x < SIZE; x++, y++) {
            if (map[y][x] == symbol) count++;
            if (count == DOTS_TO_WIN) return true;
        }
        count = 0;
        for (int x = 0, y = SIZE - 1; x < SIZE; x++, y--) {
            if (map[y][x] == symbol) count++;
            if (count == DOTS_TO_WIN) return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }
}
