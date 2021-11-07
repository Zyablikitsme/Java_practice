package ru.mirea.java.practice17_18;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет.

– пример правильных выражений: abcdefghijklmnopqrstuv18340.

– пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340.
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        String reg = "abcdefghijklmnopqrstuv18340";
        System.out.println(Pattern.matches(reg, s));
    }
}