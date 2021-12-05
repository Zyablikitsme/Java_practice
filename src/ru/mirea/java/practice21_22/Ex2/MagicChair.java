package ru.mirea.java.practice21_22.Ex2;

public class MagicChair implements Chair{

    @Override
    public void print() {
        System.out.println("Вы создали магический стул.");
    }

    public void doMagic(){
        System.out.println("***Magic***");
    }
}
