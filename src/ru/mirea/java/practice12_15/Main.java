package ru.mirea.java.practice12_15;

// Задание 1.
//Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О. Функция
//должна учитывать возможность отсутствия значений в полях Имя и Отчество. Программу оптимизировать с
//точки зрения быстродействия.


//Задание 2.
//Доработать класс адреса, который из полученной строки формата &quot;Страна[d] Регион[d] Город[d]
//Улица[d] Дом[d] Корпус[d] Квартира&quot; ([d] – разделитель, например, «запятая») выбирает соответствующие
//части и записывает их в соответствующие поля класса Address. Учесть, что в начале и конце разобранной
//части адреса не должно быть пробелов. Все поля адреса строковые. Разработать проверочный класс не
//менее чем на четыре адресных строки. В программе предусмотреть две реализации этого метода:
//а) разделитель – только запятая (использовать метод split()); Внимание, при разработке нужно учесть, что
//
//б) разделитель – любой из символов ,.;- (класс StringTokenizer).


//Задание 3.
//Реализуйте класс Shirt: Метод toString() выводит объяснение и значение полей построчно.
//Дан также строковый массив: shirts[0] = &quot;S001,Black Polo Shirt,Black,XL&quot;; shirts[1] = &quot;S002,Black
//Polo Shirt,Black,L&quot;; shirts[2] = &quot;S003,Blue Polo Shirt,Blue,XL&quot;; shirts[3] = &quot;S004,Blue Polo Shirt,Blue,M&quot;;
//shirts[4] = &quot;S005,Tan Polo Shirt,Tan,XL&quot;; shirts[5] = &quot;S006,Black T-Shirt,Black,XL&quot;; shirts[6] = &quot;S007,White T-
//Shirt,White,XL&quot;; shirts[7] = &quot;S008,White T-Shirt,White,L&quot;; shirts[8] = &quot;S009,Green T-Shirt,Green,S&quot;; shirts[9] =
//&quot;S010,Orange T-Shirt,Orange,S&quot;; shirts[10] = &quot;S011,Maroon Polo Shirt,Maroon,S&quot;;
//Преобразуйте строковый массив в массив класса Shirt и выведите его на консоль.


//Задание 4.
//Разработайте класс, который получает строковое представление телефонного номера в одном из
//двух возможных строковых форматов:
//+&lt;Код страны&gt;&lt;Номер 10 цифр&gt;, например “+79175655655” или
//“+104289652211” или
//8&lt;Номер 10 цифр&gt; для России, например “89175655655”
//и преобразует полученную строку в формат:
//+&lt;Код страны&gt;&lt;Три цифры&gt;–&lt;Три цифры&gt;–&lt;Четыре цифры&gt;


//Задание 5.
//В методе main считай с консоли имя файла, который содержит слова, разделенные пробелом. В
//методе getLine() используя StringBuilder расставьте все слова в таком порядке, чтобы последняя буква
//данного слова совпадала с первой буквой следующего не учитывая регистр. Каждое слово должно
//участвовать 1 раз.


public class Main {
    public static void main(String[] args) {
//        Person P1 = new Person("Ivanov", "Ivan", "Ivanovich");
//        System.out.println(P1.getFullName());
//
//        P1.setName("Sergey");
//        System.out.println(P1.getFullName());
//
//        Person P2 = new Person("Petrov");
//        System.out.println(P2.getFullName());
//
//        P2.setPatronymic("Arkadievich");
//        System.out.println(P2.getFullName());


        // Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира

        Address Adr1 = new Address("Russia, Moscow Oblast, Chechov, Uezdnaya, 2, -, 126", ",");
        System.out.println(Adr1);

        Address Adr2 = new Address("Russia, Moscow, Moscow, Mosfil'movskaya Ulitsa, 53, -, 24", ",");
        System.out.println(Adr2);

        Address Adr3 = new Address("Russia, Chelyabinskaya oblast', Troitsk, Alikhetovskaya Ulitsa, 34, -, -",",");
        System.out.println(Adr3);

        Address Adr4 = new Address("Russia: Chelyabinskaya oblast':Troitsk: Alikhetovskaya Ulitsa:34: -: -",":");
        System.out.println(Adr4);

        Address Adr5 = new Address("Russia, Leningrad Oblast, St Petersburg, Ulitsa Tipanova, 3, -, 5", ",");
        System.out.println(Adr5);

        Address Adr6 = new Address("Russiaz Leningrad Oblastz St Petersburgz Ulitsa Tipanovaz 3z -z 5", "z");
        System.out.println(Adr6);

    }
}
