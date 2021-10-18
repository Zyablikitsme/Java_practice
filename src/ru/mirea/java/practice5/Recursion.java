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
                System.out.print("n = ");
                n = inp.nextInt();
                rec1(n);
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
                int k = inp.nextInt(), s = inp.nextInt();
                System.out.println(rec4(0, 0, k, s));
                break;
            case 5:
                System.out.print("n = ");
                n = inp.nextInt();
                System.out.println(rec5(n));
                break;
            case 6:
                System.out.println(rec6(18, 2));
                break;
            case 7:
                int nn = inp.nextInt(), kk = inp.nextInt();
                rec7(nn, kk);
                break;
            case 8:
                System.out.print("Введите строку: ");
                String ss = inp.next();
                System.out.println(rec8(ss));
                break;
            case 9:
                break;
            case 10:
                System.out.print("n = ");
                n = inp.nextInt();
                rec10(n);
                break;
            case 11:
                break;
            case 12:
                rec12();
                break;
            case 13:
                rec13();
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
            case 16:

            case 17:
                System.out.println(rec17());
                break;
        }
    }

    public static void rec1(int n) { rec1(n, 0); }

    public static void rec1(int n, int numbe){ // OK
        for (int i = 1; i <= numbe; i++){
            if (n > 0) n--;
            else break;
            System.out.print(numbe + " ");
        }

        if (n > 0) rec1(n, numbe+1);
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

    public static int rec4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;

        for (int i = c; i < 10; i++) {
            res += rec4(len + 1, sum + i, k, s);
        }
        return res;
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

    public static boolean rec6(int n, int i) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % i == 0) return false;
        else if (i < n / 2) return rec6(n, i + 1);
        else return true;
    }

    public static void rec7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            rec7(n / k, k);
        }
        else rec7(n, ++k);
    }

    public static String rec8(String word){ // OK
        return rec8(word, 0);
    }

    public static String rec8(String word, int checkLetter){    // OK
        if (word.charAt(checkLetter) != word.charAt(word.length() - checkLetter - 1)) return "NO";
        if (checkLetter == word.length() / 2 - 1) return "YES";
        return rec8(word, ++checkLetter);
    }

    public static void rec10(int n){    // OK
        System.out.print(n % 10);
        if (n > 9) rec10(n/10);
    }

//    public static int rec11(){
//        Scanner inp = new Scanner(System.in);
//        int x = inp.nextInt();
//        int y = rec11();
//        if (x == 1) return 1;
//
//
//    }

    public static void rec12(){     // OK
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x != 0) {
            if (x % 2 == 1) System.out.println(x);
            rec12();
        }
    }

    public static void rec13(){     // OK
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x != 0) {
            System.out.println(x);
            x = inp.nextInt();
            if (x != 0) rec13();
        }

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

    public static int rec17(){  // OK
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x == 0) return 0;
        int y = rec17();
        return x > y ? x : y;
    }
}


//    1     OK
//    2     OK
//    3     OK
//    4     k znak numb sum = s
//    5     OK
//    6     sadadasda
//    7     ggssssad
//    8     OK
//    9     strange how to
//    10    OK
//    11    strange maybe
//    12    OK
//    13    OK
//    14    OK
//    15    OK
//    16    strange ssilka
//    17    OK
