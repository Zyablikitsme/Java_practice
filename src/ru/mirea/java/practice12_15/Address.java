package ru.mirea.java.practice12_15;

import java.util.StringTokenizer;

// Задание 2.

// Доработать класс адреса, который из полученной строки формата
// Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира
// ([d] – разделитель, например, «запятая») выбирает соответствующие
// части и записывает их в соответствующие поля класса Address. Учесть, что в начале и конце разобранной
// части адреса не должно быть пробелов. Все поля адреса строковые. Разработать проверочный класс не
// менее чем на четыре адресных строки. В программе предусмотреть две реализации этого метода:
//
//   а) разделитель – только запятая (использовать метод split()); Внимание, при разработке нужно учесть, что
//   б) разделитель – любой из символов ,.;- (класс StringTokenizer).


public class Address {
    String address, separator;

    String country, region, city, street, corps, apartment;

    public Address(String address, String separator) {
        this.address = address;
        this.separator = separator;

        if(separator.equals(",")) separation1();
        else separation2();
    }

    public void separation1(){
        String[] separatedAddress = this.address.split(",");

        for (int i = 0; i < 6; i++){
            separatedAddress[i] = separatedAddress[i].replaceFirst("\\s", "");
            switch(i){
                case 0:
                    country = separatedAddress[i];
                    break;
                case 1:
                    region = separatedAddress[i];
                    break;
                case 2:
                    city = separatedAddress[i];
                    break;
                case 3:
                    street = separatedAddress[i];
                    break;
                case 4:
                    corps = separatedAddress[i];
                    break;
                case 5:
                    apartment = separatedAddress[i];
                    break;
            }
        }
    }

    public void separation2(){
        StringTokenizer separatedAddress = new StringTokenizer(address, separator);

        for (int i = 0; i < 6; i++){
            switch(i){
                case 0:
                    country = separatedAddress.nextToken().replaceFirst("\\s", "");
                    break;
                case 1:
                    region = separatedAddress.nextToken().replaceFirst("\\s", "");
                    break;
                case 2:
                    city = separatedAddress.nextToken().replaceFirst("\\s", "");
                    break;
                case 3:
                    street = separatedAddress.nextToken().replaceFirst("\\s", "");
                    break;
                case 4:
                    corps = separatedAddress.nextToken().replaceFirst("\\s", "");
                    break;
                case 5:
                    apartment = separatedAddress.nextToken().replaceFirst("\\s", "");
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return
                "\naddress='" + address + '\'' +
                " \nseparator= \"" + separator + "\"" +
                " \ncountry= '" + country + '\'' +
                " \nregion= '" + region + '\'' +
                " \ncity= '" + city + '\'' +
                " \nstreet= '" + street + '\'' +
                " \ncorps= '" + corps + '\'' +
                " \napartment= '" + apartment + '\'';
    }
}
