package ru.geekbrains.lesson3;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {

    int workingDays;

    public Freelancer(String surName, String name, double salary, String speciality, int workingDays) {
        super(surName, name, salary, speciality);
        this.workingDays = workingDays;
    }

    @Override
    public double calculateSalary() {
        return salary * workingDays * 8;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Специальность: %s; %.2f(руб.); рабочих дней %d; сумма за месяц %.2f (руб.)", name, surName, speciality, salary, workingDays, salary * workingDays * 8);
    }
}



