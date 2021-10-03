package ru.mirea.java.practice5;

import java.util.Scanner;

public class Recursion {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        System.out.print("Введите номер упражнения(1-17) или 0 для выхода: ");
        x = inp.nextInt();
        int n;
        int A, B;

        switch(x){
            case 1:

                break;
            case 2:
                System.out.print("n = ");
                n = inp.nextInt();
                rec2(n);
                break;
            case 3:
                System.out.print("A = ");
                A = inp.nextInt();
                System.out.print("B = ");
                B = inp.nextInt();
                rec3(A, B);
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
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                System.out.print("n = ");
                n = inp.nextInt();
                rec14(n);
                break;
            case 15:
                System.out.print("n = ");
                n = inp.nextInt();
                rec15(n);
                break;
        }
    }

    public static void rec1(int n){
        int k = n;
        n++;
        for (int i = 0; i < n-k; i++){

        }
    }

    public static void rec2(int n){ // OK
        if (n != 1) rec2(n-1);
        System.out.print(n + " ");
    }

    public static void rec3(int A, int B){ // OK
        System.out.println(A);

        if (A < B) rec3(++A, B);
        else if (A > B) rec3(--A, B);
    }

    public static int rec5(int n){ // OK
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

    public static void rec14(int N){ // OK
        if (N > 9) rec14(N / 10);
        System.out.println(N % 10);
    }

    public static void rec15(int N){ // OK
        System.out.println(N % 10);
        if (N > 9) rec15(N / 10);
    }

//    public static void rec16(){
//        int x = -1, max = x;
//        while (x != 0) {
//            Scanner inpt = new Scanner(System.in);
//            x = inpt.nextInt();
//            if (x > max) max = x;
//        }
//
//
//    }

}
