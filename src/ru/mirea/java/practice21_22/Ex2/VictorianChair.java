package ru.mirea.java.practice21_22.Ex2;

public class VictorianChair implements Chair{
    private int age;

    @Override
    public void print() {
        System.out.println("Вы создали викторианский стул.");
    }

    public int getAge() {
        return age;
    }

    public VictorianChair(int age) {
        this.age = age;
    }
}
