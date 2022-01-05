package com.geekbrains;

public class MainOOP {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван", "Менеджер по продажам", "ivanovivan@gmail.com", "889456123", 80000, 35);
        persArray[1] = new Employee("Смирнов Андрей", "Супервайзер", "smirnovandrey@mail.ru", "875468924", 44000, 28);
        persArray[2] = new Employee("Дорохов Александр Юриевич", "Дизайнер", "alexdor@yandex.ru", "877788866", 150000, 42);
        persArray[3] = new Employee("Ломоносов Дмитрий Сергеевич", "Бухгалтер", "lomonosovds@gmail.com", "877665544", 100000, 41);
        persArray[4] = new Employee("Хватаев Фантазия Наэтович", "Маркетолог", "fantakhvat@rambler.ru", "877766666", 130000, 35);
        for(int i = 0; i < 5; i++){
            if(persArray[i].getAge() > 40){

                System.out.println("Сотрудник: " + persArray[i].getFullName() + " старше 40 лет");
            }
        }
    }
}
