package ru.mirea.java.practice6.ex1;

public class TestClass {

    public static void InsertionSort (Comparable[] students){
        for (int i = 1; i < students.length; i++){
            for (int j = 0; j < i; j++){
                if (students[i].compareTo(students[j]) < 0){
                    Comparable temp = students[i];
                    for (int k = i; k > j; k--) students[k] = students[k-1];
                    students[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable[] students = new Comparable[7];
        students[0] = (new Student("Ivan", "Nefedov", 10, 3, 4.14));
        students[1] = (new Student("Artem", "Azurov", 15, 8, 3.69));
        students[2] = (new Student("Vladimir", "Mencov", 11, 3, 4.81));
        students[3] = (new Student("Sergey", "Borovenok", 18, 11, 3.06));
        students[4] = (new Student("Diana", "Dubova", 8, 1, 4.58));
        students[5] = (new Student("Nikita", "Dudkin", 7, 1, 4.44));
        students[6] = (new Student("Viktoria", "Selezneva", 9, 3, 4.18));

        System.out.println("Array before sort");
        for (int i = 0; i < students.length; i++) System.out.println(students[i].toString() + " ");
        System.out.print("\n");

        InsertionSort(students);

        System.out.println("Array after sort");
        for (int i = 0; i < students.length; i++) System.out.println(students[i].toString() + " ");
    }

}
