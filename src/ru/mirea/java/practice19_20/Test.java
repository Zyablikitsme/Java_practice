package ru.mirea.java.practice19_20;

import java.util.*;

public class Test {
    static public void arrTest(ArrayList<String> arr, String autoNumberForFind){
        System.out.print("\nПоиск перебором: номер ");
        long mMillis = System.currentTimeMillis();
        long mNanos = System.nanoTime();

        if (arr.contains(autoNumberForFind)) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс");
    }

    static public void arrBinaryTest(ArrayList<String> arr, String autoNumberForFind){
        System.out.print("\nБинарный поиск:  номер ");

        Collections.sort(arr);

        long mMillis = System.currentTimeMillis();
        long mNanos = System.nanoTime();

        int findedArrIndex = Collections.binarySearch(arr, autoNumberForFind);

        if (findedArrIndex >= 0) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс");
    }

    static public void hashSetTest(HashSet<String> hashS, String autoNumberForFind){
        System.out.print("\nПоиск в HashSet: номер ");

        long mMillis = System.currentTimeMillis();
        long mNanos = System.nanoTime();

        if (hashS.contains(autoNumberForFind)) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс");
    }

    static public void treeSetTest(TreeSet<String> treeS, String autoNumberForFind){
        System.out.print("\nПоиск в TreeSet: номер ");

        long mMillis = System.currentTimeMillis();
        long mNanos = System.nanoTime();

        if (treeS.contains(autoNumberForFind)) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс\n\n");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Generator gen = new Generator();

        System.out.print("Кол-во номеров для генерации(N): ");
//        int N = inp.nextInt();
        int N = 1000000;

        System.out.print("Номер для поиска: ");
//        String autoNumberForFind = inp.next();
        String autoNumberForFind = "А111ВЕ190";

        ArrayList<String> arrFirst = new ArrayList<String>();
        for (int i = 0; i < N; i++) arrFirst.add(gen.generate());

        ArrayList<String> arrSecond = arrFirst;
        HashSet<String> hashS = new HashSet<String>(arrFirst);
        TreeSet<String> treeS = new TreeSet<String>(arrFirst);

        arrTest(arrFirst, autoNumberForFind);
        arrBinaryTest(arrSecond, autoNumberForFind);
        hashSetTest(hashS, autoNumberForFind);
        treeSetTest(treeS, autoNumberForFind);

//        switch(chosen){
//            case 1:{
//                ArrayList<String> arr = new ArrayList<String>();
//
//                for (int i = 0; i < N; i++) arr.add(gen.generate());
//
//                long mMillis = System.currentTimeMillis();
//                long mNanos = System.nanoTime();
//
//                if (arr.contains(autoNumberToFind)) System.out.printf("Найден");
//                else System.out.printf("Не найден");
//
//                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
//                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));
//
//                break;
//            }
//            case 2:{
//                ArrayList<String> arr = new ArrayList<String>();
//
//                for (int i = 0; i < N; i++) arr.add(gen.generate());
//
//                Collections.sort(arr);
//
//                long mMillis = System.currentTimeMillis();
//                long mNanos = System.nanoTime();
//
//                int findedArrIndex = Collections.binarySearch(arr, autoNumberToFind);
//
//                if (findedArrIndex >= 0) System.out.printf("Найден");
//                else System.out.printf("Не найден");
//
//                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
//                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));
//
//                break;
//            }
//            case 3:{
//                HashSet<String> hashS = new HashSet<String>();
//
//                for (int i = 0; i < N; i++) hashS.add(gen.generate());
//
//                long mMillis = System.currentTimeMillis();
//                long mNanos = System.nanoTime();
//
//                if (hashS.contains(autoNumberToFind)) System.out.printf("Найден");
//                else System.out.printf("Не найден");
//
//                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
//                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));
//
//                break;
//            }
//            case 4:{
//                TreeSet<String> treeS = new TreeSet<String>();
//
//                for (int i = 0; i < N; i++) treeS.add(gen.generate());
//
//                long mMillis = System.currentTimeMillis();
//                long mNanos = System.nanoTime();
//
//                if (treeS.contains(autoNumberToFind)) System.out.printf("Найден");
//                else System.out.printf("Не найден");
//
//                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
//                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));
//
//                break;
//            }
//            default:{
//                System.out.println();
//            }
//        }
    }
}
