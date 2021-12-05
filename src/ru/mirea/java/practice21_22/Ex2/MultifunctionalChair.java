package ru.mirea.java.practice21_22.Ex2;

public class MultifunctionalChair implements Chair {

    @Override
    public void print() {
        System.out.println("Вы создали многофункциональный стул.");
    }

    public int sum(int a, int b){
        return a+b;
    }
}
