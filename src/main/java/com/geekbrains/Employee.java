package com.geekbrains;

public class Employee {
    private String fullName; //ФИО
    private String position; //Должность
    private String email;  //почта
    private String phoneNumber; //телефон
    private int salary; //зарплата
    private int age; //возраст

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age){
        String formatedText = String.format("Добавлен сотрудник: %s. Доржность: %s. Почта: %s. Телефон: %s. Зарплата: %s. Возраст: %s.", fullName,position,email,phoneNumber,salary,age);
        System.out.println(formatedText);
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        System.out.println();
    }
    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
}

