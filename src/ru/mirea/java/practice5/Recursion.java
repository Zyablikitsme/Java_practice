package ru.mirea.java.practice5;

import java.util.Scanner;

public class Recursion {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        x = inp.nextInt();
        System.out.println(rec6(x, 2));
    }

    public static String rec6(int x, int de){
        int del = de;

        if (x % del == 0 && del != x) return "YES";
        else if (del == x) return "NO";
        else rec6(x, del+1);

        return "ERROR";
    }
}
