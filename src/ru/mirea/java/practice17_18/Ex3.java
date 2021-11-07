package ru.mirea.java.practice17_18;


/*
Есть текст со списками цен. Извлечь из него цены в USD, RUR, EU.

– пример правильных выражений: 23.78 USD.

– пример неправильных выражений: 22 UDD, 0.002 USD.
 */

// 23.78 USD 22 UDD, 0.002 USD

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        String s = inp.nextLine();

        String reg = "[0-9]+[.][0-9]{0,2} (USD|RUR|EU)";

        String test = "23.78 USD 22 UDD, 0.002 USD. 15 RUB 19.0 RUR 19.73 RUR 14 EU 14.05 EU 0.1 EU";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(test);

        while (matcher.find()) System.out.println(matcher.group());
    }


}
