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
                System.out.print("Проверить число: ");
                System.out.println(rec6(inp.nextInt(), 2));
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
                int a = inp.nextInt(), b = inp.nextInt();
                System.out.println(rec9(a, b));
                break;
            case 10:
                System.out.print("n = ");
                n = inp.nextInt();
                rec10(n);
                break;
            case 11:
                System.out.println(rec11());
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
                rec16(0, 0);
                break;
            case 17:
                System.out.println(rec17());
                break;
        }
    }

    public static void rec1(int n) { rec1(n, 0); }

    public static void rec1(int n, int numbe){
        for (int i = 1; i <= numbe; i++){
            if (n > 0) n--;
            else break;
            System.out.print(numbe + " ");
        }

        if (n > 0) rec1(n, numbe+1);
    }

    public static void rec2(int n){
        if (n != 1) rec2(n-1);
        System.out.print(n + " ");
    }

    public static void rec3(int A, int B){
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

    public static int rec5(int n){
        int sum = 0;
        if (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (n > 0) sum += rec5(n);
        return sum;
    }

    public static String rec6(int n, int i) {
        if (n < 2) return "NO";
        else if (n == 2) return "YES";
        else if (n % i == 0) return "NO";
        else if (i < n/2) return rec6(n, i + 1);
        else return "YES";
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

    public static String rec8(String word, int checkLetter){
        if (word.charAt(checkLetter) != word.charAt(word.length() - checkLetter - 1)) return "NO";
        if (checkLetter == word.length() / 2 - 1) return "YES";
        return rec8(word, ++checkLetter);
    }

    public static int rec9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return rec9(a, b - 1) + rec9(a - 1, b - 1);
    }

    public static void rec10(int n){
        System.out.print(n % 10);
        if (n > 9) rec10(n/10);
    }

    public static int rec11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return rec11() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return rec11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return rec11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void rec12(){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x != 0) {
            if (x % 2 == 1) System.out.println(x);
            rec12();
        }
    }

    public static void rec13(){
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if (x != 0) {
            System.out.println(x);
            x = inp.nextInt();
            if (x != 0) rec13();
        }

    }

    public static void rec14(int N){
        if (N > 9) rec14(N / 10);
        System.out.println(N % 10);
    }

    public static void rec15(int N){
        System.out.println(N % 10);
        if (N > 9) rec15(N / 10);
    }

    public static void rec16(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                rec16(n, 1);
            } else if (n == max) {
                rec16(max, ++count);
            } else {
                rec16(max, count);
            }
        } else {
            System.out.println(count);
        }
    }

    public static int rec17(){
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
