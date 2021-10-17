package ru.mirea.java.practice6.ex2;

public class QuickSort {

    public static void QuickSort_(Comparable[] students, int leftBorder, int rightBorder){

        if (leftBorder < rightBorder) {
            Comparable pivot = students[rightBorder];
            int i = leftBorder-1;

            for (int j = leftBorder; j < rightBorder; j++) {
                if (pivot.compareTo(students[j]) >= 0) {
                    i++;
                    Comparable temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }

            Comparable temp = students[i + 1];
            students[i + 1] = pivot;
            students[rightBorder] = temp;

            QuickSort_(students, leftBorder, i);
            QuickSort_(students, i+2, rightBorder);
        }
    }

    public static void main(String[] args) {
        Comparable[] students = new Comparable[7];
        students[0] = (new SortingStudentsByGPA("Ivan", "Nefedov", 10, 3, 4.14));
        students[1] = (new SortingStudentsByGPA("Artem", "Azurov", 15, 8, 3.69));
        students[2] = (new SortingStudentsByGPA("Vladimir", "Mencov", 11, 3, 4.81));
        students[3] = (new SortingStudentsByGPA("Sergey", "Borovenok", 18, 11, 3.06));
        students[4] = (new SortingStudentsByGPA("Diana", "Dubova", 8, 1, 4.58));
        students[5] = (new SortingStudentsByGPA("Nikita", "Dudkin", 7, 1, 4.44));
        students[6] = (new SortingStudentsByGPA("Viktoria", "Selezneva", 9, 3, 4.18));

        System.out.println("Array before sort");
        for (int i = 0; i < students.length; i++) System.out.println(students[i].toString() + " ");
        System.out.print("\n");

        QuickSort_(students, 0, students.length-1);

        System.out.println("Array after sort");
        for (int i = 0; i < students.length; i++) System.out.println(students[i].toString() + " ");
    }
}
