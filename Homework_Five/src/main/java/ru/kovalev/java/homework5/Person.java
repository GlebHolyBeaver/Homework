package ru.kovalev.java.homework5;

public class Person {

    public String nameSurname;
    public String email;
    public String position;
    public String gender;
    public String telephone;
    public int height;
    public int salary;
    public int age;

    public Person() {
        this.nameSurname = "ФИО неизвестно";
        this.email = "email неизвестен";
        this.position = "Должность неизвестна";
        this.gender = "Пол неизвестен";
        this.height = -1;
        this.telephone = "Телефон неизвестен" ;
        this.salary = -1;
        this.age = -1;
        System.out.println("ФИО сотрудника: " + this.nameSurname);
        System.out.println("Пол сотрудника: " + this.gender);
        System.out.println("Возраст сотрудника: " + this.age);
        System.out.println("Рост сотрудника: " + this.height);
        System.out.println("Должность сотрудника: " + this.position);
        System.out.println("Зарплата сотрудника: " + this.salary);
        System.out.println("Телефон сотрудника: " + this.telephone);
        System.out.println("email сотрудника: " + this.email);
    }

    public Person(String nameSurname, String gender, int age, int height, String position, int salary, String telephone, String email) {
        this.nameSurname = nameSurname;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.position = position;
        this.salary = salary;
        this.telephone = telephone;
        this.email = email;
    }

//    public Person(int f) {
//        for (int i = 0; i < 5; i++) {
//            if (this.age > 40) {
//                System.out.println("ФИО сотрудника: " + nameSurname);
//                System.out.println("Пол сотрудника: " + gender);
//                System.out.println("Возраст сотрудника: " + age);
//                System.out.println("Рост сотрудника: " + height);
//                System.out.println("Должность сотрудника: " + position);
//                System.out.println("Зарплата сотрудника: " + salary);
//                System.out.println("Телефон сотрудника: " + telephone);
//                System.out.println("email сотрудника: " + email);
//            }
//        }
//    }


//        System.out.println("ФИО сотрудника: " + nameSurname);
//        System.out.println("Пол сотрудника: " + gender);
//        System.out.println("Возраст сотрудника: " + age);
//        System.out.println("Рост сотрудника: " + height);
//        System.out.println("Должность сотрудника: " + position);
//        System.out.println("Зарплата сотрудника: " + salary);
//        System.out.println("Телефон сотрудника: " + telephone);
//        System.out.println("email сотрудника: " + email);
}
