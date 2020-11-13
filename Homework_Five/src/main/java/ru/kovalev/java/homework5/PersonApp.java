package ru.kovalev.java.homework5;

public class PersonApp {

    public static void main(String[] args) {
        Person person0 = new Person();
        Person[] personalList = new Person[5];
        personalList[0] = new Person("Иванов Иван Иванович", "мужчина", 33, 170, "Директор", 200000, "+7 (964)-453-67-12", "iivanov@gmail.com");
        personalList[1] = new Person("Иванов Артем Копатович", "мужчина", 51, 179, "Инженер", 50000, "+7 (964)-567-78-10", "iengeneer@gmail.com");
        personalList[2] = new Person("Цветкова Ксения Сергеевна", "женщина", 18, 156, "Секретарь", 30000, "+7 (903)-348-78-00", "kaniacvet@yandex.ru");
        personalList[3] = new Person("Воробьев Никита Дмитриевич", "мужчина", 26, 188, "Уборщик", 15000, "+7 (903)-123-47-12", "lightydragon@mail.ru");
        personalList[4] = new Person("Стрельникова Ольга Владимировна", "женщна", 43, 162, "Программист", 75000, "+7 (903)-853-67-67", "hacker228@mail.ru");
//      Не смог сделать последнее задание, но пытался
//        for (int f = 0; f < personalList.length; f++) {
//            personalList[f] = new Person(f);
//        }
    }
}

