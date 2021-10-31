package ru.mirea.java.practice12_15;

// Задание 4.
//Разработайте класс, который получает строковое представление телефонного номера в одном из
//двух возможных строковых форматов:
//+Код страны&gt;&lt;Номер 10 цифр&gt;, например “+79175655655” или
//“+104289652211” или
//8&lt;Номер 10 цифр&gt; для России, например “89175655655”
//и преобразует полученную строку в формат:
//+&lt;Код страны&gt;&lt;Три цифры&gt;–&lt;Три цифры&gt;–&lt;Четыре цифры&gt;


public class PhoneNumber {
    String number, readableNumber;

    public PhoneNumber(String number) {
        this.number = number;

        if (number.charAt(0) == '+') readablePhoneNumberWithPlus();
        else readablePhoneNumberWithEight();
    }

    public void readablePhoneNumberWithPlus(){
        readableNumber = number.format("%.2s %.3s %.3s %.4s", number, number.substring(2), number.substring(5), number.substring(8));
    }

    public void readablePhoneNumberWithEight(){
        readableNumber = number.format("%.1s %.3s %.3s %.4s", number, number.substring(1), number.substring(4), number.substring(7));
    }

    @Override
    public String toString() {
        return "\nInput: " + number
                + "\nAfter: " + readableNumber;
    }
}
