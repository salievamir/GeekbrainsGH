package com.geekbrains;


public class Main2 {


    public static void main(String[] args) {
        arrMatrix();
        arr100();
        lessSix();
        squareX();
        twoArguments(5, 1);
        minMax();
        System.out.println(checkBalance());
    }

    public static void arrMatrix() {//1. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void arr100() {//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void lessSix() {//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 6) {
                arr[j] *= 2;
            }
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    public static void squareX() { //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int a = 5;
        int x = 1;
        int[][] table = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j || j == a || (i + j) == (a - 1)) {
                    table[i][j] = x;
                    System.out.print(x + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static int[] twoArguments(int len, int initialValue) {//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        return arr;
    }

    public static void minMax() { //Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int[] arr = {-11, 2, -1, 4, -10};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min= " + min);
        System.out.println("max= " + max);
    }

    public static boolean checkBalance() {//Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        boolean bool = false;
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int sum1 = 0, sum2 = 0;
        for (int i = 0, j = arr.length - 1; i < arr.length && j >= 0; i++, j--) {
            sum1 += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {

            sum2 += arr[i];
            if (sum2 == (sum1 - sum2)) {
                bool = true;
                break;
            }

        }
        return bool;

    }

}








