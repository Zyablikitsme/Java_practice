package ru.mirea.java.practice12_15;

import java.io.FileReader;
import java.io.IOException;
import java.lang.StringBuilder;

// В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом.
// В методе getLine() используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
// данного слова совпадала с первой буквой следующего не учитывая регистр. Каждое слово должно
// участвовать 1 раз.

public class Ex5 {
    private StringBuilder wordsInLine;
    private static String[] correctWords;

    public Ex5(StringBuilder wordsInLine) {
        this.wordsInLine = wordsInLine;
    }

    public StringBuilder getLine(){
        String[] words = wordsInLine.toString().split(" ");
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

    public static void main(String[] args) throws IOException {
        StringBuilder wordsInLine = new StringBuilder("");

        try(FileReader inp = new FileReader("file.txt")) {
            int c;
            while((c=inp.read())!=-1){
                wordsInLine.append((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        Ex5 a = new Ex5(wordsInLine);

        System.out.println(a.getLine());
    }
}
