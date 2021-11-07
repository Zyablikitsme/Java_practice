package ru.mirea.java.practice17_18;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
Написать регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом.

– пример правильных выражений: aE:dC:cA:56:76:54.

– пример неправильных выражений: 01:23:45:67:89:Az.
 */

public class Ex2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();

        String reg = "([a-f[A-F[0-9]]]{2}[:]){5}([a-f[A-F[0-9]]]){2}";
        System.out.println(Pattern.matches(reg, s));
    }
}
