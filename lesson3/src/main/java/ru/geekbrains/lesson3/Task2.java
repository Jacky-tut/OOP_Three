package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        String[] specialities = new String[]{"программист", "продавец", "менеджер", "дизайнер", "бухгалтер"};

        int salary = random.nextInt(100, 200);
        int workingDays = random.nextInt(20);
        int index = random.nextInt(100, 200);
        if (random.nextInt(1, 3) == 1) {
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index, specialities[random.nextInt(5)]);
        } else {
            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], salary, specialities[random.nextInt(5)], workingDays);
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        Arrays.sort(employees, new SpecialityComparator());

        System.out.printf("-------------------------------------------------------------------------------------\n");

        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}