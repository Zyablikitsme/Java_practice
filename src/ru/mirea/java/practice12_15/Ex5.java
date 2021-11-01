package ru.mirea.java.practice12_15;

import java.util.Scanner;
import java.lang.StringBuilder;

//  В методе main считай с консоли слова, разделенные пробелом. В
// методе getLine() используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
// данного слова совпадала с первой буквой следующего не учитывая регистр. Каждое слово должно
// участвовать 1 раз.

public class Ex5 {
    private String wordsInLine;
    private static String[] correctWords;

    public Ex5(String wordsInLine) {
        this.wordsInLine = wordsInLine;
    }

//    public void getLine() {
//        String[] words = wordsInLine.split(" ");
//        correctWords = new String[words.length];
//
//        int lastWord = 0;
//
//        for (int j = 1; j < words.length; j++) {
//            if ((words[lastWord].toLowerCase()).charAt(words[lastWord].length() - 1) ==
//                    (words[j].toLowerCase()).charAt(0)) {
//                correctWords[lastWord] = words[lastWord];
//                correctWords[lastWord + 1] = words[j];
//                lastWord += 1;
//                break;
//            }
//        }
//
//        boolean bad = false;
//
//        for (int z = 0; z < words.length; z++){
//            for (int i = 0; i < words.length; i++) {
//                if ((correctWords[lastWord].toLowerCase()).charAt(correctWords[lastWord].length() - 1) ==
//                        (words[i].toLowerCase()).charAt(0)) {
//                    for (int j = 0; j < correctWords.length; j++) {
//                        if (words[i].equals(correctWords[j])) bad = true;
//                    }
//
//                    if (!bad) {
//                        lastWord++;
//                        correctWords[lastWord] = words[i];
//                    }
//                }
//            }
//        }
//    }

    public StringBuilder getLine(){
        String[] words = wordsInLine.split(" ");
        correctWords = new String[words.length];
        StringBuilder answer = new StringBuilder();

        int lastWord = 0;
        answer.append(words[lastWord]);
        correctWords[lastWord] = words[0];

        boolean bad = false;

        for (int z = 0; z < words.length; z++){
            for (int i = 0; i < words.length; i++) {
                bad = false;
                if ((correctWords[lastWord].toLowerCase()).charAt(correctWords[lastWord].length() - 1) ==
                        (words[i].toLowerCase()).charAt(0)) {
                    for (int j = 0; j < correctWords.length; j++) {
                        if (words[i].equals(correctWords[j])) bad = true;
                    }

                    if (!bad) {
                        lastWord++;
                        correctWords[lastWord] = words[i];
                        answer.append(" " + words[i]);
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String wordsInLine = inp.nextLine();

        Ex5 a = new Ex5(wordsInLine);

        System.out.println(a.getLine());

//        for (String s : a.correctWords) System.out.print(s + " ");
    }
}
