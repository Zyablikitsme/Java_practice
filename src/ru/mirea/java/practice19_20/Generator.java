package ru.mirea.java.practice19_20;

import java.util.Random;

public class Generator {
    private String[] autoNumbLetters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Ч"};

    public String generate(){
        Random randomizer = new Random();

        String firstLetter = autoNumbLetters[randomizer.nextInt(autoNumbLetters.length)];
        int middleNumbers = randomizer.nextInt(10);
        String secondLetter = autoNumbLetters[randomizer.nextInt(autoNumbLetters.length)];
        String thirdLetter = autoNumbLetters[randomizer.nextInt(autoNumbLetters.length)];
        int region = randomizer.nextInt(200);

        return (firstLetter + String.valueOf(middleNumbers).repeat(3) + secondLetter + thirdLetter + region);
    }
}
