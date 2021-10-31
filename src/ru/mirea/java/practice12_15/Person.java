package ru.mirea.java.practice12_15;

import java.lang.StringBuffer;


// Задание 1.

// Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О.
// Функция должна учитывать возможность отсутствия значений в полях Имя и Отчество.
// Программу оптимизировать с точки зрения быстродействия.

public class Person {
    private String surname, name, patronymic;

    public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.patronymic = "-";
    }

    public Person(String surname) {
        this.surname = surname;
        this.name = "-";
        this.patronymic = "-";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName(){
        return new StringBuffer().append(surname).append(" ").append(name).append(" ").append(patronymic).toString();
    }
}
