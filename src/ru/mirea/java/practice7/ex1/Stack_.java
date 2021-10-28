package ru.mirea.java.practice7.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

// Напишите программу в виде консольного приложения, которая
// моделирует карточную игру «пьяница» и определяет, кто выигрывает. В игре
// участвует 10 карт, имеющих значения от 0 до 9, большая карта побеждает
// меньшую; карта «0» побеждает карту «9».

// Карточная игра “ В пьяницу”.
// В этой игре карточная колода раздается
// поровну двум игрокам. Далее они открывают по одной верхней карте, и тот, чья
// карта старше, забирает себе обе открытые карты, которые кладутся под низ его
// колоды. Тот, кто остается без карт, - проигрывает.
// Для простоты будем считать, что все карты различны по номиналу и что
// самая младшая карта побеждает самую старшую карту (“шестерка берет туз”).
// Игрок, который забирает себе карты, сначала кладет под низ своей колоды
// карту первого игрока, затем карту второго игрока (то есть карта второго игрока
// оказывается внизу колоды).

// Входные данные.
// Программа получает на вход две строки: первая строка содержит 5 карт
// первого игрока, вторая - 5 карт второго игрока. Карты перечислены сверху вниз,
// то есть каждая строка начинается с той карты, которая будет открыта первой.

// Выходные данные.
// Программа должна определить, кто выигрывает при данной раздаче, и
// вывести слово first или second, после чего вывести количество ходов, сделанных
// до выигрыша. Если на протяжении 106 ходов игра не заканчивается, программа
// должна вывести слово botva.

// Пример ввода.
// 1 3 5 7 9
// 2 4 6 8 0
// second 5

public class Stack_ { // lifo
    public static void main(String[] args) {
        Stack<Integer> firstP = new Stack<>();
        Stack<Integer> secondP = new Stack<>();

        Scanner inp = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.print("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++) arr[i] = inp.nextInt();
        for (int i = 0; i < 5; i++) firstP.push(arr[5-i-1]);

        System.out.print("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++) arr[i] = inp.nextInt();
        for (int i = 0; i < 5; i++) secondP.push(arr[5-i-1]);

        int count = 0;
        while(true){
            if (count == 106) {
                System.out.println("botva");
                break;
            }
            if (firstP.empty()) {
                System.out.println("second " + count);
                break;
            }
            else if (secondP.empty()){
                System.out.println("first " + count);
                break;
            }
            else {
                int firstPCard = firstP.pop(), secondPCard = secondP.pop();

                if (firstPCard == 0 && secondPCard == 9) addToEnd(firstP, secondPCard, firstPCard, 2);
                else if (secondPCard == 0 && firstPCard == 9) addToEnd(secondP, firstPCard, secondPCard, 1);
                else if (firstPCard > secondPCard) addToEnd(firstP, secondPCard, firstPCard, 2);
                else if (secondPCard > firstPCard) addToEnd(secondP, firstPCard, secondPCard, 1);

                count++;
            }
        }
    }

    public static void addToEnd(Stack<Integer> st, int x, int y, int whoseX){
        ArrayList<Integer> array = new ArrayList<>();

        while (!st.empty()) array.add(st.pop());

        if (whoseX == 1) {
            st.push(y);
            st.push(x);
        }
        else if (whoseX == 2){
            st.push(x);
            st.push(y);
        }
        for (int i = 0; i < array.size(); i++) st.push(array.get(array.size() - i - 1));
    }
}
