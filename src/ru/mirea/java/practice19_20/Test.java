package ru.mirea.java.practice19_20;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Generator gen = new Generator();

        System.out.print("Кол-во номеров для генерации(N): ");
        int N = inp.nextInt();

        System.out.print("Номер для поиска: ");
        String autoNumberToFind = inp.next();

        System.out.println("\n1. Прямым перебором по ArrayList, (array.contains())");
        System.out.println("2. Бинарным поиском по сортированному ArrayList, (Collections.binarySearch())");
        System.out.println("3. Поиском в HashSet, (setHash.contains())");
        System.out.println("4. Поиском в TreeSet. (setTree.contains())");
        int chosen = inp.nextInt();

//        String[] arr = new String[N];
//        for (int i = 0; i < N; i++) arr[i] = gen.generate();

        switch(chosen){
            case 1:{
                ArrayList<String> arr = new ArrayList<String>();

                for (int i = 0; i < N; i++) arr.add(gen.generate());

                long mMillis = System.currentTimeMillis();
                long mNanos = System.nanoTime();

                if (arr.contains(autoNumberToFind)) System.out.printf("Найден");
                else System.out.printf("Не найден");

                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));

                break;
            }
            case 2:{
                ArrayList<String> arr = new ArrayList<String>();

                for (int i = 0; i < N; i++) arr.add(gen.generate());

                Collections.sort(arr);

                long mMillis = System.currentTimeMillis();
                long mNanos = System.nanoTime();

                int findedArrIndex = Collections.binarySearch(arr, autoNumberToFind);

                if (findedArrIndex >= 0) System.out.printf("Найден");
                else System.out.printf("Не найден");

                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));

                break;
            }
            case 3:{
                HashSet<String> hashS = new HashSet<String>();

                for (int i = 0; i < N; i++) hashS.add(gen.generate());

                long mMillis = System.currentTimeMillis();
                long mNanos = System.nanoTime();

                if (hashS.contains(autoNumberToFind)) System.out.printf("Найден");
                else System.out.printf("Не найден");

                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));

                break;
            }
            case 4:{
                TreeSet<String> treeS = new TreeSet<String>();

                for (int i = 0; i < N; i++) treeS.add(gen.generate());

                long mMillis = System.currentTimeMillis();
                long mNanos = System.nanoTime();

                if (treeS.contains(autoNumberToFind)) System.out.printf("Найден");
                else System.out.printf("Не найден");

                System.out.println("\nMillis = " + (double) (System.currentTimeMillis() - mMillis));
                System.out.println("Nanos = " + (double) (System.nanoTime() - mNanos));

                break;
            }
            default:{
                System.out.println();
            }
        }

    }
}
