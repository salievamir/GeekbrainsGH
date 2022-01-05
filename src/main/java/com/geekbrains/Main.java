package com.geekbrains;

public class Main {

    public static void main(String[] args) {

        System.out.println(checkSum(10, 10));
        inteGer(10);
        System.out.println(rev(-10));
        hwDone("Success", 5);
        System.out.println(leapYear(2100));

    }

    public static boolean checkSum(int a, int b) { //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void inteGer(int c) { //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        if (c >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean rev(int d) { //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        if (d >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void hwDone(String string, int n) { //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз.
        for (int i = n; i >= 0; i--) {
            System.out.println(string);
        }
    }

    public static boolean leapYear(int year) { //Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        if (year % 4 == 0 && ((year / 100) % 4 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}

