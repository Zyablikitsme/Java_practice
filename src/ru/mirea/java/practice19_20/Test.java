package ru.mirea.java.practice19_20;

import java.util.*;

public class Test {
    static public void arrTest(ArrayList<String> arr, String autoNumberForFind){
        System.out.print("\nПоиск перебором: номер");

        long mNanos = System.nanoTime();

        if (arr.contains(autoNumberForFind)) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс");
    }

    static public void arrBinaryTest(ArrayList<String> arr, String autoNumberForFind){
        System.out.print("\nБинарный поиск:  номер");

        Collections.sort(arr);

        long mNanos = System.nanoTime();

        int findedArrIndex = Collections.binarySearch(arr, autoNumberForFind);

        if (findedArrIndex >= 0) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс");
    }

    static public void hashSetTest(HashSet<String> hashS, String autoNumberForFind){
        System.out.print("\nПоиск в HashSet: номер");

        long mNanos = System.nanoTime();

        if (hashS.contains(autoNumberForFind)) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс");
    }

    static public void treeSetTest(TreeSet<String> treeS, String autoNumberForFind){
        System.out.print("\nПоиск в TreeSet: номер");

        long mNanos = System.nanoTime();

        if (treeS.contains(autoNumberForFind)) System.out.print(" найден,");
        else System.out.print(" не найден,");

        System.out.print(" поиск занял " + (double) (System.nanoTime() - mNanos) + "нс\n\n");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Generator gen = new Generator();

        System.out.print("Кол-во номеров для генерации(N): ");
        int N = inp.nextInt();

        System.out.print("Номер для поиска: ");
        String autoNumberForFind = inp.next();

        ArrayList<String> arrFirst = new ArrayList<String>();
        for (int i = 0; i < N; i++) arrFirst.add(gen.generate());

        ArrayList<String> arrSecond = arrFirst;
        HashSet<String> hashS = new HashSet<String>(arrFirst);
        TreeSet<String> treeS = new TreeSet<String>(arrFirst);

        arrTest(arrFirst, autoNumberForFind);
        arrBinaryTest(arrSecond, autoNumberForFind);
        hashSetTest(hashS, autoNumberForFind);
        treeSetTest(treeS, autoNumberForFind);
    }
}
