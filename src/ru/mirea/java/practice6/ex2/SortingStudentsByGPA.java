package ru.mirea.java.practice6.ex2;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA> {
    private String name, surname;
    private int age, form;
    private double GPA;

    public SortingStudentsByGPA(String name, String surname, int age, int form, double GPA) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.form = form;
        this.GPA = GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setForm(int form) {
        this.form = form;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getForm() {
        return form;
    }

    public double getGPA() {
        return GPA;
    }

//    @Override // по возростанию
//    public int compareTo(SortingStudentsByGPA s){
//        if (this.GPA > s.GPA) return 1;
//        else if (this.GPA == s.GPA) return 0;
//        else return -1;
//    }

    @Override // по убыванию
    public int compareTo(SortingStudentsByGPA s){
        if (this.GPA > s.GPA) return -1;
        else if (this.GPA == s.GPA) return 0;
        else return 1;
    }

    @Override
    public String toString() {
        return "SortingStudentsByGPA{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", form=" + form +
                ", GPA=" + GPA +
                '}';
    }
}
