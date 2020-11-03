package ru.kovalev.java.homework2;

import java.util.Arrays;

public class HomeworkTwo {

    public static int Math1(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean BetweenTenTwenty(int a, int b) {
        int value = a + b;
        if (value >= 10) return (value <= 20);
        return false;
    }

    public static String MoreOrLess(int value) {
        if (value >= 0) return "Значение больше или равно нулю";
        return "Значение меньше нуля";
    }

    public static boolean ValueIsNegative(int value) {
        return value < 0;
    }

    public static String SayMyName(String name) {
        return "Привет, " + name;
    }

    public static String YearIsLeap(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) return "Год високосный";
        }
        return "Год не високосный";
    }

    public static int[] OneAndZero() {
        int[] swap = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int index = 0; index < 10; index++) {
            if (swap[index] == 1) swap[index]--;
            else swap[index]++;
        }
        return swap;
    }

    public static int[] GetNumber() {
        int[] get = new int[8];
        for (int index = 0, value = 0; index < 8; index++, value += 3) {
            get[index] = value;
        }
        return get;
    }

    public static int[] LessThanSix() {
        int[] divide = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int index = 0; index < 12; index++) {
            if (divide[index] < 6) divide[index] *= 2;
        }
        return divide;
    }

    public static int[][] Diagonal() {
        int[][] ones = new int[5][5];
        for (int y = 0; y < ones.length; y++) {
            for (int x = 0; x < ones[0].length; x++) {
                if (y == x) ones[y][x] = 1;
                System.out.print(ones[y][x] + " ");
            }
            System.out.println();
        }
        return ones;
    }

    public static boolean HalfArray() {
        int[] half = {3, 4, 2, 2, 4, 12, 3};
        int summary = 0;
        for (int index = 0; index < half.length; index++) {
            summary += half[index];
        }
        summary /= 2;
        int edges = 0;
        for (int index = 0; index < half.length; index++) {
            edges += half[index];
            if (edges == summary) return true;
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println("Выражение = " + Math1(10, 20, 9, 3));
        System.out.println("Сумма a и b лежит в пределах от 10 до 20: " + BetweenTenTwenty(9, 7));
        System.out.println("Введенное значение положительное или отрицательное? - " + MoreOrLess(-1));
        System.out.println("Это значение отрицательное: " + ValueIsNegative(-2));
        System.out.println(SayMyName("Глеб") + "!");
        System.out.println("Високосный ли этот год? -" + YearIsLeap(2100));
        System.out.println("Дальше ДЗ по массивам");
        System.out.println("______________________________________________________________");
        System.out.println("Замена 0 и 1 местами: " + Arrays.toString(OneAndZero()));
        System.out.println("Присваивание значений с помощью цикла: " + Arrays.toString(GetNumber()));
        System.out.println("Увелечение значений меньше 6 вдвое: " + Arrays.toString(LessThanSix()));
        System.out.println(Diagonal());
        int[] min = {1, 4, 12, 6, 7, 4, -1, 9};
        int maximum = 0;
        int minimum = 0;
        for (int index = 0; index < min.length; index++) {
            if (min[index] > maximum) maximum = min[index];
            if (min[index] < minimum) minimum = min[index];
        }
        System.out.println("Максимальное значение массива = " + maximum);
        System.out.println("Минимальное значение массива = " + minimum);
        System.out.println("Сумма двух частей равна между собой: " + HalfArray());
    }
}