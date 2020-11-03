package ru.kovalev.java.homework3;

import java.util.Random;
import java.util.Scanner;

public class HomeworkThree {
    private static Scanner answer = new Scanner(System.in);

    public static String GuessTheWord() {
        String word = "";
        String[] guessWord = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Ваша задача угадать слово");
        Random random = new Random();
        int randomInt = random.nextInt(guessWord.length - 1);
        String randomWord = guessWord[randomInt];
//        System.out.println(randomWord); - Подсказка слова
        while (true){
            word = answer.nextLine();
            if (word.equals(randomWord)) break;
            int minValue = Math.min(word.length(), randomWord.length());
            for (int index = 0; index < minValue; index++) {
                if (word.charAt(index) == randomWord.charAt(index)) {
                    System.out.print(randomWord.charAt(index));
                }
                if (word.charAt(index) != randomWord.charAt(index)) {
                    System.out.print("#");
                }
            }
            for (int i = 0; i < 15 - minValue; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
        return "Вы угадали";
    }



    public static String GuessTheNumber() {
        System.out.println("Ваша задача угадать число от 0 до 9!");
        Random random = new Random();
        int randomInt = random.nextInt(9);
        for (int i = 0; i < 3; i++) {
            int value = answer.nextInt();
            if (value > randomInt) {
                System.out.println("Загаданное число меньше.");
            }
            if (value < randomInt) {
                System.out.println("Загаданное число больше.");
            }
            if (value == randomInt) return "Вы угадали!";
        }
        return "Вы не угадали!";
    }


    public static void main(String[] args) {
        int repeat = 0;
        do {
            String GuessNumber = GuessTheNumber();
            System.out.println(GuessNumber);
            System.out.println("Хотите сыграть еще раз? 1: да; 0: нет");
            repeat = answer.nextInt();
        } while (repeat == 1);
        System.out.println("Ну нет так нет(");
        String GuessWord = GuessTheWord();
        System.out.println(GuessWord);
        answer.close();
    }
}

