package ru.mirea.java.practice7.ex2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Queue_ { // fifo
    public static void main(String[] args) {
        Queue<Integer> firstP = new LinkedList<Integer>(), secondP = new LinkedList<Integer>();

        Scanner inp = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.print("Введите карты первого игрока: ");
        for (int i = 0; i < 5; i++) firstP.offer(inp.nextInt());

        System.out.print("Введите карты второго игрока: ");
        for (int i = 0; i < 5; i++) secondP.offer(inp.nextInt());

        int count = 0;
        while(true){
            if (count == 106) {
                System.out.println("botva");
                break;
            }
            if (firstP.isEmpty()) {
                System.out.println("second " + count);
                break;
            }
            else if (secondP.isEmpty()){
                System.out.println("first " + count);
                break;
            }
            else {
                int firstPCard = firstP.poll(), secondPCard = secondP.poll();

                if (firstPCard == 0 && secondPCard == 9) {
                    firstP.offer(firstPCard);
                    firstP.offer(secondPCard);
                }
                else if (secondPCard == 0 && firstPCard == 9) {
                    secondP.offer(firstPCard);
                    secondP.offer(secondPCard);
                }
                else if (firstPCard > secondPCard) {
                    firstP.offer(firstPCard);
                    firstP.offer(secondPCard);
                }
                else if (secondPCard > firstPCard) {
                    secondP.offer(firstPCard);
                    secondP.offer(secondPCard);
                }

                count++;
            }
        }
    }
}
