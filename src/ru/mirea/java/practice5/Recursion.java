package ru.mirea.java.practice5;

import java.util.Scanner;

public class Recursion {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        System.out.print("Введите номер упражнения(1-17) или 0 для выхода: ");
        x = inp.nextInt();
        int n;

        switch(x){
            case 1:

                break;
            case 2:
                System.out.print("n = ");
                n = inp.nextInt();
                rec2(n);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.print("n = ");
                n = inp.nextInt();
                System.out.println(rec5(n));
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
        }
    }

//    public static void rec1(int n){
//        int k = n;
//        n++;
//        for (int i = 0; i < n-k; i++){
//
//        }
//    }

    public static void rec2(int n){
        if (n != 1) rec2(n-1);
        System.out.print(n + " ");
    }

    public static void rec3(int A, int B){

    }

    public static int rec5(int n){ // Дано 1234 получить 10
        int sum = 0;
        if (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (n > 0) sum += rec5(n);
        return sum;
    }

    public static String rec6(int x, int de){
        int del = de;

        if (x % del == 0 && del != x) return "YES";
        else if (del == x) return "NO";
        else rec6(x, del+1);

        return "ERROR";
    }
}
